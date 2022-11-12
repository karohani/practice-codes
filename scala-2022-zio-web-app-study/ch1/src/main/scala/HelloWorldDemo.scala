import zio._

import java.io.IOException

object HelloWorldDemo extends ZIOAppDefault {
  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = consoleProgram()

  def consoleProgram(): ZIO[Any, IOException, Unit] = for {
    your <- Console.readLine("Enter your name: ")
    _ <- Console.print(s"Hello $your")
  } yield {}
}
