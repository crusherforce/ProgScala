def square(x: Int) = x*x
square(3)

def factorial(x:BigInt):BigInt=
  if(x==0)1 else x*factorial(x-1)
factorial(6)

def sort(xs:Array[Int]): Unit = {
  def swap(i:Int, j:Int): Unit = {
    val t = xs(i)
    xs(i) = xs(j)
    xs(j) = t
  }

  def sort1(l:Int, r:Int): Unit = {
    val pivot = xs((l+r)/2)
    var i = l
    var j = r
    while (i<=j) {
      while (xs(i) < pivot) i+=1
      while (xs(j) > pivot) j-=1
      if (i<=j) {
        swap(i,j)
        i+=1
        j-=1
      }
    }
    if (l<j) sort1(l,j)
    if (j<r) sort1(i,r)
  }
  sort1(0,xs.length-1)
}
var a = Array(3,2,1,4,3)
sort(a)