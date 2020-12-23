import scala.collection.mutable

object Ch03 extends App {
  val greetStrings = new Array[String](3)

  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

//  for (i <- 0 to 2)
//    print(greetStrings(i))

  /*
  List
   */

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour

  //println("" + oneTwo + " and " + threeFour + " were not mutated.")
  //println("This, " + oneTwoThreeFour + " is a new list.")

  // Some 'List' methods and usages

  var list = List("Cool", "tools", "rule")
  //println(list)

  val thrill = "Will" :: "fill" :: "until" :: Nil
//  println(thrill)
//  println("The Length of 'thrill' is = " + thrill.size)
//  println(thrill.drop(2))
//  println(thrill.dropRight(2))
//  println(thrill.contains("until"))
//  println(thrill.filter(s => s.length == 4))
//  println(thrill.forall(s => s.endsWith("l")))
//  thrill.foreach(s=>print(s))

//  println(thrill.head)
//  println(thrill.init)
//  println(thrill.last)

//  println(thrill.map(s => s + "y"))
//  println(thrill.mkString(", "))
//  println(thrill.reverse)

  /****************************
   * Use Tuples
   */
  val tuple = (36, "India", "Australia", "Hazelwood", "Rahane", "Kohli")
//  println(tuple._3)
//  println(tuple._6)

  /****************************
   * || Class Hierarchy for Scala sets ||
   * scala.collection.Set<<trait>>
   *   - scala.collection.immutable.Set<<trait>>
   *     - scala.collection.immutable.HashSet
   *   - scala.collection.mutable.Set<<trait>>
   *     - scala.collection.mutable.HashSet
   *
   */
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  println(jetSet)
  println(jetSet.contains("Cessna"))

  import scala.collection.immutable.HashSet
  val hashSet = HashSet("Tomatoes", "Chilies")
  println(hashSet + "Coriander")

  /****************************
   * || Class Hierarchy for Scala maps ||
   * scala.collection.Map<<trait>>
   *   - scala.collection.immutable.Map<<trait>>
   *     - scala.collection.immutable.HashMap
   *   - scala.collection.mutable.Map<<trait>>
   *     - scala.collection.mutable.HashMap
   *
   */

  import scala.collection.mutable.Map
  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))

}
