import zhttp.http.{Http, Request}
import zio._

// web server를 만들어 보세요
// https://github.com/dream11/zio-http/blob/main/example/src/main/scala/example/HelloWorld.scala

object App extends ZIOAppDefault {

  import zhttp._
  import zhttp.http._
  import zio.json._
  import zio.json.JsonCodec._

  final case class Todo(i: Long, title: String)

  val list: Map[Long, Todo] = Map(
    1L -> Todo(1L, "첫번째 Todo"),
    2L -> Todo(2L, "첫번째 Todo"),
    3L -> Todo(3L, "첫번째 Todo"))

  object Todo {
    implicit val todoJsonCodec: JsonCodec[Todo] = DeriveJsonCodec.gen[Todo]
  }

  val app = Http.collect[Request] {
    case Method.GET -> !! / "hello" =>
      Response.text("world")
    case Method.GET -> !! / "todo" / "list" => Response.json(list.toJson) // String
    case Method.GET -> !! / "todo" / id =>
      id.toLongOption match {
        case Some(i) => list.get(i) match {
          case Some(todo) => Response.json(todo.toJson)
          case None => Response.status(Status.NotFound)
        }
        case None => Response.status(Status.BadRequest)
      }
  }

  def run = zhttp.service.Server.start(8080, app)
}
