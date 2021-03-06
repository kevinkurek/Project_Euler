// Find sum of even fibonaccis whose values don't exceed 4M

class even_fib_calc(max_fib_num:Int) {

  val fibs: Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)
  val fibs_list_even_sum: Int = fibs.takeWhile(_<max_fib_num).filter(_%2==0).sum

  override def toString = s"Final Sum is: ${fibs_list_even_sum}"
  }

object Problem2{

  def theAns(max_fib_num:Int) = new even_fib_calc(max_fib_num).fibs_list_even_sum

  def main(args: Array[String])= {
  println(theAns(4000000))
}

}
