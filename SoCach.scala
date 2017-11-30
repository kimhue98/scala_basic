import io.StdIn

object SoCach {
  def TimSoCach(n: Int): Int={
   var m= n / 1000 
   var Gia2 : Int= m / 2  
   var Gia5 : Int= m / 5
   var kq= 0;
   
   for(i<-0 to Gia5; j<- 0 to Gia2; k <-0 to m)
     if( i + j + k == m)
       kq += 1
       kq
}
  def main(args: Array[String]): Unit = {
    var n: Int = readInt
    println(" so cach chia tien la: " + TimSoCach(n))
  }
}