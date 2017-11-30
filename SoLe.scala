import io.StdIn

object SoLe {
 def Tong(n: Int): Int={
    
    var S , i= 0
    var a= n 
    while(a != 0){
      i= a %10 
      if(i % 2 != 0)
        S += i;
      a = a/10
      
    }
    
    
    S
  }
  
  def main(args: Array[String]): Unit = {
    println("Nhap so n: ")
    var n= readInt() 
    println("Tong cac so le la: " + Tong(n))
  }
}
