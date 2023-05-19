package exercise10

import common.UnitSpec
class SquareTest extends UnitSpec {

  "Square" should "Square Number is List Using Case" in {
    assert(new Square().squareListWithCaseMatching(List(2, 3)) === List(4, 9))
  }

  "Square" should "Square Number is List Using Map" in {
    assert(new Square().squareListWithMap(List(2, 3)) === List(4, 9))
  }
}
