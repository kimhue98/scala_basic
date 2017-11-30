

object MaTran {
  
  def main(args: Array[String]): Unit = {
    var a = readInt
    var b = readInt
    var myArray = Array.ofDim[Int](a,b)
    
    var sec,fir = Int.MinValue
    
    for(i<-0 until a)
      for(j<-0 until b){
        myArray(i)(j) = readInt
        if(myArray(i)(j) >= fir){
          sec = fir
          fir = myArray(i)(j) 
        }
        if(myArray(i)(j) > sec && myArray(i)(j) < fir){
          sec = myArray(i)(j)
        }
      }
    print(sec)
  }
  
}