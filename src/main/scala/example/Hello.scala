package example

object Hello {

  def factorial(x: BigInt): BigInt =
    if (x == 0) { 1 }
    else { x * factorial(x - 1) }

  // def max(x:Int, y:Int): Int = if x > y then x else y

  def main(args: Array[String]): Unit = {
    val greeting = "Hello"
    println(greeting)
    greeting.foreach(c => printf("%c / ", c))
    println()

    val numbers = new Array[Int](3)
    numbers(0) = 1
    numbers(1) = 2
    numbers(2) = 3
    val total = numbers.foldLeft(0)(_ + _)
    println(total)

    val cash = factorial(30)
    println(cash)
  }

}
