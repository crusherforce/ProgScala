import java.io.File

object Ch07 extends App {
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(x: Long, y: Long): Long =
    if (y == 0) x else gcd(y, x % y)

  println(gcdLoop(12, 4))
  println(gcd(12, 5))

  for (i <- 1 to 2)
    println("gcd(16," + i + ") = " + gcd(16, i))

  val filesHere = (new File(".")).listFiles()

  //  for (file <- filesHere) {
  //    println("----------------------------")
  //    println("File Name = " + file)
  //    println("IsDirectory = " + file.isDirectory)
  //    println("canRead = " + file.canRead)
  //    println("canWrite = " + file.canWrite)
  //    println("canExecute = " + file.canExecute)
  //    println("getPath = " + file.getPath)
  //    println("getName = " + file.getName)
  //    println("getParent = " + file.getParent)
  //    println("getParentFile = " + file.getParentFile)
  //    println("getAbsoluteFile = " + file.getAbsoluteFile)
  //    println("getAbsolutePath = " + file.getAbsolutePath)
  //    println("getCanonicalFile = " + file.getCanonicalFile)
  //    println("getCanonicalPath = " + file.getCanonicalPath)
  //    println("getFreeSpace = " + file.getFreeSpace)
  //    println("getTotalSpace = " + file.getTotalSpace)
  //    println("getUsableSpace = " + file.getUsableSpace)
  //  }

  def scalaFiles =
    for {
      file <- filesHere
    } yield file

  println(scalaFiles.length)

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + line.trim)

  grep(".*gcd.*")

  val firstArg = if (args.length > 0) args(0) else ""
  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }

  def printMultiTable(): Unit = {
    var i = 1
    while (i <= 10) {
      var j = 1
      while (j <= 10) {
        var prod = (i * j).toString
        var k = prod.length
        // 4 spaces between digits in a row
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      println()
      i += 1
    }
  }

  printMultiTable()

  def makeRowSeq(row:Int)=
    for (col <- 1 to 10) yield {
      val prod = (row*col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  def makeRow(row:Int)=makeRowSeq(row).mkString

  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }

  println(multiTable())
}
