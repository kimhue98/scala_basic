import math._

object SX_SNT {
  
 def isPrime(n: Long): Boolean = !((2 +: (3 to sqrt(n).toInt by 2)) exists (n%_ == 0)) 
  
  def T_G(arr:Array[Int]): Unit={
    var arr1:Array[Int]=  arr
    
      for(i<-0 until arr.length )
          for(j <- i + 1 until arr.length )
            if(isPrime(arr1(i)) && isPrime(arr1(j)) && arr1(i) > arr1(j))
              arr1= arr1.updated(i, arr1(j)).updated(j, arr1(i))
              
    arr1.foreach(println(_))
  }
  def main(args: Array[String]): Unit = {
     var n = readLine
    var arr:Array[Int] = n.split(" ").map(_.toInt)
    T_G(arr)
  }
}