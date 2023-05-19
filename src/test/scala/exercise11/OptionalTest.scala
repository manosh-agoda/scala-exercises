package exercise11

import common.UnitSpec
class OptionalTest extends UnitSpec {

  "Optional" should "Gets First Optional that is not None" in {
    assert(new OptionalExercise().getFirstNotNone(None, None, Some(3)) === 3)
  }

  "Optional" should "Gets Product" in {
    assert(new OptionalExercise().getProduct(Some(2), Some(3), Some(4)) === 24)
  }

  "Optional" should "Get First not None from Sequence" in {
    assert(new OptionalExercise().getFirstNotNoneFromSequence(Seq(None, Some(1), Some(2))) === 1)
  }

}
