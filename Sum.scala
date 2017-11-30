import scala.io.StdIn

/*object Sum {
  def TinhTong(a:Int): Unit={
    var s: Float = 0
   var t: Float = 0
    
    for( i <- 1 to a)
    {
      s += i
      t += 1/ s
    }
    println(t)
  }
  def main(args: Array[String]): Unit = {
    println("Nhap n: ");
    var n = scala.io.StdIn.readInt()
    TinhTong(n)
  }
}*/

object Sum {
  
  def main(args: Array[String]): Unit = {
    println("Nhap n: ");
    var n = readInt()
    println("tong can tinh la: " + (2 - 2.0/(1 +n)))
  }
}