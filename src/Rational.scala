class Rational(i: Int, j: Int) {
  require(j != 0)

  private val g = gcd(i.abs, j.abs)
  val numerator: Int = i / g
  val denominator: Int = j / g
  println("Created " + numerator + "/" + denominator)

  def add(that: Rational): Rational =
    new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

  def lessThan(that: Rational) =
    this.numerator * that.numerator < that.numerator * this.denominator

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  def +(i: Int): Rational =
    new Rational(numerator + i * denominator, denominator)

  def -(i: Int): Rational =
    new Rational(numerator - i * denominator, denominator)

  def *(i: Int): Rational =
    new Rational(numerator * i, denominator)

  def /(i: Int): Rational =
    new Rational(numerator, denominator * i)

  def -(that: Rational): Rational =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  override def toString: String = numerator + "/" + denominator

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
