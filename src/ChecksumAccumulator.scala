import Ch04.ChecksumAccumulator

object ChecksumAccumulator {
  private var cache = Map[String, Int]()

  def calculate(s:String) =
    if (cache.contains((s)))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s) {
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s->cs)
      cs
    }
}
