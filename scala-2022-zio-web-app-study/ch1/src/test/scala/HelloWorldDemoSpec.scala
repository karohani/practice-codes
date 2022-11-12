import zio._
import zio.test._

object HelloWorldDemoSpec extends ZIOSpecDefault {
  val spec = suite("Hello Assert") (
    test("hello world, 12345") {
      for {
        result <- ZIO.succeed(1) // Effect도 가능
      } yield assertTrue( result == 1)
    },
    test("console program test") {
      for {
        _ <- TestConsole.feedLines("jae.gawata")
        _ <- HelloWorldDemo.consoleProgram()
        output <- TestConsole.output
        helpMsg = output(0)
        resultMsg = output(1)
      } yield {
        assertTrue(helpMsg == "Enter your name: ") &&
          assertTrue(resultMsg == "Hello jae.gawata")
      }
    }
  )
  val spec2 = suite("test") (
    suite("nested suite")(
      // 오 되네요? 그러게요 BDD 스타일로 코드 짤 수 있을거 같네요.
      // 잘 만들었네네      test("nested suite test") {
        ???
      }
    )
  )

}
