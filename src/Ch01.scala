import java.math.BigInteger

object Ch01 extends App {
  var capital = Map("India" -> "New Delhi", "France" -> "Paris")
  capital += ("Australia" -> "Canberra")

  //println(capital("France"))

  def factorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def max2(x: Int, y: Int): Int = if (x > y) x else y

  //println(factorial(BigInteger.valueOf(6)))

  val name = "Radhika Ghosh"
  //println(name.exists(_.isWhitespace))

  //println(max(10, 12))
  //println(max2(12, 10))

  var i = 0
  while (i < 5) {
    if (i != 0)
      print(" ")
    print(i)
    i += 1
  }
}

