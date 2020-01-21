//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

import scala.collection.mutable
//import scala.math._
import util.control.Breaks._
//import scala.util.control.Breaks.break

object Problem3 {

  def prime_factors(n:Int): Int= {
    var num = n
    // starting divisor
    var d: Int = 2
    // Starting empty MutableList
    var factors = mutable.MutableList[Int]()

    breakable {
      while (num > 1) {
        while (num % d == 0) {
          factors += d
          num /= d
        }
        d += 1
        if (d * d > num) {
          if (n > 1) {
            factors += num
            break}
          }
        }
      }
    println(factors)
      factors.max}

  def main(args: Array[String]): Unit={
    println(Problem3.prime_factors(10))
  }

}
