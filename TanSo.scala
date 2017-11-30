

object TanSo {
  def f(ar: Array[Int]){
    var c, max, maxAV = 0
    var arr = ar.sortWith((x,y) => x < y)

    arr.foreach(s => print(s + " "))
    println()
    for( i <- 0 until arr.length - 1){
      var k = i
      while(k < arr.length - 1 && arr(k) == arr(k+1)){
        c+=1
        k+=1
      }
      if( c > max){
        max = c  
      }
      c = 0
    }
    for( i <- 0 until arr.length - 1){
      var k = i
      while(k < arr.length - 1 && arr(k) == arr(k+1)){
        c+=1
        k+=1
        
      }
      if( c == max ){
        println(arr(i))
      }
      c = 0
    }
    
    println(max + 1)
    
  }
  def main(args: Array[String]): Unit = {
    var n = readLine
    var arr:Array[Int] = n.split(" ").map(_.toInt)
    f(arr)
  }
}