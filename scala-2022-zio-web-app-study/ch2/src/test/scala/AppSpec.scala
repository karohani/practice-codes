import App.Todo
import zio._
import zio.test._

// 서버를 테스트해보세요
// https://zio.dev/reference/test/
// https://sttp.softwaremill.com/en/latest/quickstart.html
// https://sttp.softwaremill.com/en/latest/backends/zio.html
import zio.json._
import zio.json.JsonCodec._

object AppSpec extends ZIOSpecDefault {
  override def spec = suite("App")(
    test("request test") {
      import sttp.client3._
      val query = "http language:scala"
      val sort: Option[String] = None

      // the `query` parameter is automatically url-encoded
      // `sort` is removed, as the value is not defined
      val request = basicRequest.get(
        uri"http://localhost:8080/todo/list")

      val backend: SttpBackend[Identity, Any] = HttpClientSyncBackend()
      val response: Identity[Response[Either[String, String]]] = request.send(backend)

      for {
        body <- ZIO.fromEither(response.body)
        map <- ZIO.fromEither(body.fromJson[Map[Long, Todo]])
      } yield {
        assertTrue(map.size == 3)
      }
    }
  )
}
