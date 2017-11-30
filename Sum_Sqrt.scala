import math._
import io.StdIn

object Sum_Sqrt {
  def Tong(a : Int ): Double={
    var i: Int = 1;
    var S : Double = 0
    for(i <- 1 to a)
      S= sqrt( i + S) 
       S
  }
  def main(args: Array[String]): Unit = {
    println("Nhap gia tri cua n: ")
    var n= readInt() 
    println("Tong can tinh la: " + Tong(n))
  }
}