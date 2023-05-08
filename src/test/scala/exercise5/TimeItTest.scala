package exercise5

import common.UnitSpec
import exercise4.GCD

class TimeItTest extends UnitSpec {

  "TimeIt" should "Find Execution Time For GCD" in {
    val gcd = new GCD
    val timeIt = new TimeIt
    assert(timeIt.findExecutionTime(gcd.compute(51, 65)) === 1)
  }

}
