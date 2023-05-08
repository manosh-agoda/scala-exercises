package exercise3

import common.UnitSpec
class CompareDoubleTest extends UnitSpec {

  "A Compare Double" should "Two Doubles Equal" in {
    val compareDouble = new CompareDouble()
    assert(compareDouble.~=(1.011, 1.009) === true)
  }

  "A Compare Double" should "Two Doubles Not Equal" in {
    val compareDouble = new CompareDouble()
    assert(compareDouble.~=(1.01, 1.00) === false)
  }

  "A Compare Double" should "Two Doubles Equal for 3 decimal values" in {
    val compareDouble = new CompareDouble()
    compareDouble.precision = 0.001
    assert(compareDouble.~=(1.0001, 1.0002) === true)
  }

  "A Compare Double" should "Two Doubles Not Equal for 3 decimal values" in {
    val compareDouble = new CompareDouble()
    compareDouble.precision = 0.001
    assert(compareDouble.~=(1.001, 1.002) === false)
  }
}
