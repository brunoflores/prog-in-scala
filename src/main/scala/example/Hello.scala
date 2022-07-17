package example

object Hello {

  def factorial(x: BigInt): BigInt = {
    if (x == 0) { 1 }
    else { x * factorial(x - 1) }
  }

  def main(args: Array[String]): Unit = {
    println("Hello")
    val cash = factorial(30)
    println(cash)
  }

}
