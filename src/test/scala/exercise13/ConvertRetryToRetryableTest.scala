package exercise13

import common.UnitSpec
class ConvertRetryToRetryableTest extends UnitSpec {

  "ConvertRetryToRetryable" should "No Exception" in {
    assert(new ConvertRetryToRetryable().retry(foo(1))(2, 100) === 1)
  }

  "ConvertRetryToRetryable" should "With Exception" in {
    assertThrows[Exception] {
      new ConvertRetryToRetryable().retry(foo(2))(3, 100)
    }
  }

  def foo(value: Int): Int = {
    if(value > 1) {
      throw new Exception("Error")
    }
    value
  }

}
