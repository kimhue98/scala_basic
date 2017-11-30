import io.StdIn

object KhoangCach {
  def d(arr: Array[Float]): Unit={
    var Min=arr(0)
    var Max =arr(0)
    for(i <- 1 to arr.length -1){
      if(arr(i)< Min) Min= arr(i) 
      if(arr(i) > Max) Max= arr(i)
    }
    println("[a; b]= " + Min + ", " + Max)
    
  } 
  def main(args: Array[String]): Unit = {
     var n = readLine
    var arr:Array[Float] = n.split(" ").map(_.toFloat)
    /*arr.foreach(println(_))
    var arr:List[Float] =  List()
    var a = readInt
    for( i<- 0 until a){
      var x = readFloat
      arr = arr:+ x*/
       d(arr)

  }
}