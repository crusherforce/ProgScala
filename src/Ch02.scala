object Ch02 extends App {
  val greetStrings = new Array[String](3)

  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2)
    print(greetStrings(i))

  /*
  List
   */

  val oneTwo = List(1,2)
  val threeFour = List(3,4)
  val oneTwoThreeFour = oneTwo ::: threeFour

  println("" + oneTwo + " and " + threeFour + " were not mutated.")
  println("This, " + oneTwoThreeFour + " is a new list.")
}
