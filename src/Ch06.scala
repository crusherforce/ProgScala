object Ch06 extends App {
  val oneHalf = new Rational(5,10)
  val oneFourth = new Rational(5,20)
  // val wrongOne = new Rational(5,0)
  println(oneHalf.add(oneFourth))

  implicit def intToRational(x:Int) = new Rational(x,1)
  val r = new Rational(2,3)
  println(2-r)
}