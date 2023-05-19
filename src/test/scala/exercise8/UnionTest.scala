package exercise8

import common.UnitSpec
class UnionTest extends UnitSpec {

  "Union" should "Returns all values" in {
    val firstSet = new EmptySet incl 1 incl 2 incl 3 incl 4 incl 5 incl 7
    val secSet = new EmptySet incl 3 incl 5 incl 6
    val resultSet = firstSet union secSet
    assert(resultSet contains 1)
    assert(resultSet contains 2)
    assert(resultSet contains 3)
    assert(resultSet contains 4)
    assert(resultSet contains 5)
    assert(resultSet contains 6)
    assert(resultSet contains 7)
    assert((resultSet contains 8) === false)
  }

}
