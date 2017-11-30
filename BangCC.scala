

object BangCC {
  def BCC(){
  
  for(i <- 1 to 9)
  {
    for(j <- 1 to 9)
      print(j + " x " + i + " = " + i * j + "\t")
    println()
  
  }
  }
  def main(args: Array[String]): Unit = {
    BCC
  }
}