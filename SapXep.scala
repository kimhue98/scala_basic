

object SapXep {
  def T_G(arr:Array[Int]): Unit={
    var arr1:Array[Int]=  arr
    
      for(i<-0 until arr.length ){
          for(j <- i + 1 until arr.length )
          {
            if(arr1(i) % 2 == 0 && arr1(j) % 2 == 0 && arr1(i) > arr1(j))
              arr1= arr1.updated(i, arr1(j)).updated(j, arr1(i))
              if(arr1(i) % 2 != 0 && arr1(j) % 2 != 0 && arr1(i) < arr1(j))
              arr1= arr1.updated(i, arr1(j)).updated(j, arr1(i))
          }
          
  
      }
    arr1.foreach(println(_))
  }
  def main(args: Array[String]): Unit = {
     var n = readLine
    var arr:Array[Int] = n.split(" ").map(_.toInt)
    T_G(arr)
  }
}
