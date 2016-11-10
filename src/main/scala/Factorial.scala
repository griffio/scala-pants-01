import scala.annotation.tailrec

object Factorial {
  def apply(n: Long): Long = {
    @tailrec
    def accumulator(acc: Long, n: Long): Long = {
      if (n == 0) acc else accumulator(n * acc, n - 1)
    }
    accumulator(1, n)
  }
}