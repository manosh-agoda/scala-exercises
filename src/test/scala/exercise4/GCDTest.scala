package exercise4

import common.UnitSpec

class GCDTest extends UnitSpec {

  "GCD" should "Get Greatest Common Divisor" in {
    val gcd = new GCD
    assert(gcd.compute(20, 12) === 4)
  }

  "GCD" should "Get Greatest Common Divisor With NO GCD" in {
    val gcd = new GCD
    assert(gcd.compute(51, 65) === 1)
  }

}
