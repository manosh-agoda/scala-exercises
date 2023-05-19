package exercise12

import common.UnitSpec
class MultiplyFromMapValuesTest extends UnitSpec {

  "MultilpyFromMapValues" should "Multiply Values" in {
    assert(new MultiplyFromMapValues().multiply(List(1, 2, 3, 4), Map(1 -> 3, 3 -> 5)) === List(3, 15))
  }

}
