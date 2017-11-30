import io.StdIn

object TamGiacPCf {
  
  def GiaiThua(a: Int): Int={
    var s: Int = 1
    for( i <- 1 to a)
      s *= i
      s
  }
  
  def ToHop(k:Int, n:Int): Int={
    GiaiThua(n)/(GiaiThua(k)*GiaiThua(n-k))
  }
  
  def cout(n: Int): Unit={
    for(i<- 0 until n){
      for(j<- 0 to i)
        print(ToHop(j,i)+ "    ")
        println()
    }
  
  }
   def main(args: Array[String]): Unit = {
     var n: Int= readInt
     cout(n + 1)
   }
}