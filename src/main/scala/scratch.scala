import util.control.Breaks._

object scratch {

  def funct(): Unit = {
    breakable {
      for (i <- 1 to 10) {
        println(i)
        if (i > 4){
          println("Breaking")
          break
        }
      }
    }
  }

  def main(args: Array[String])={
    println(scratch.funct)
  }
}
