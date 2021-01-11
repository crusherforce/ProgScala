object Ch05 extends App{

  val hex = 0x5
  val hex2 = 0x00ff
  val magic = 0xcafebabe
//  println(hex)
//  println(hex2)
//  println(magic)
  // Obsolete syntax => val oct = 035
  val tower = 35L
//  println(tower)
  val bigger = 1.2345e1
//  println(bigger)
  val biggerStill = 123e45
//  println(biggerStill)

//  println(
//  """|Welcome to Ultamix 3000.
//     |Type "Help" for help.""".stripMargin)

  val s = 'aSymbol
  val t = 'aSymbol
//  println(s.getClass)
//  println(s.hashCode())

  val longSum = 1 + 2L
//  println(longSum.getClass)

  val u = "Hello World!"
//  println(u.indexOf('o',5))

  val v = 2.0.unary_-
//  println(v)

//  println(Math.IEEEremainder(11.0,4.0))

  val toBe = true
//  println(toBe || !toBe)

  def salt() = {println("salt");false}
//  println(salt().getClass)

  val w = List(1,2,3)
  val x = List(1,2,3)
//  println(w == x)

  println(0.max(5))
  println(5.min(0))
  println(-2.7.abs)
  println(-2.7.round)
  println(1.5.isInfinity)
  println((1.0/0).isInfinity)
  println(4.to(6))
  println("bob".capitalize)
  println("robert".drop(2))

}
