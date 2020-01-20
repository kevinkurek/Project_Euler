import org.scalatest.{FlatSpec, Matchers}

class ProblemCheck extends FlatSpec with Matchers {

  "Problem 1 with value of 10" should "give the answer 23." in {
    Problem1.theSum(10) should be (23)
  }

  "Problem 2 with value of 4000000" should "give the answer 4613732." in {
    Problem2.theAns(4000000) should be (4613732)
    }

}
