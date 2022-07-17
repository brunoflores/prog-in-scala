package rational

class Rational(n: Int, d: Int):
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString(): String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)

  def add(that: Rational): Rational =
    Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

object Entry:
  def main(args: Array[String]): Unit =
    val x = Rational(5, 2)
    println("End")
