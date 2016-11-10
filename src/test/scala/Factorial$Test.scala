import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Factorial$Test extends FlatSpec with Matchers {
  "Factorial result" must "be 4" in {
    assert(Factorial(4) == 24)
  }
}