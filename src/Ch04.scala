object Ch04 extends App {

  /**
   * Classes and Objects
   */
  class CheckSumAcc {

    private var sum = 0

    def add(b: Byte): Unit = {
      sum += b
    }

    def checksum(): Int = {
      ~(sum & 0xff) + 1
    }
  }

  class ChecksumAccumulator {
    private var sum = 0

    def add(b: Byte): Unit = sum += b

    def checksum() = ~(sum & 0xFF) + 1
  }

  var acc = new CheckSumAcc
  var csa = new ChecksumAccumulator
  println(acc.checksum())
  acc.add(3)
  println(acc.checksum())
  println(csa.checksum())
}
