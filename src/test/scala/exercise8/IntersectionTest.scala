package exercise8

import common.UnitSpec

class IntersectionTest extends UnitSpec {

  "Intersection" should "Return Common Values" in {
    val firstSet = new EmptySet incl 1 incl 2 incl 3 incl 4 incl 5 incl 7
    val secSet = new EmptySet incl 3 incl 5 incl 6
    val resultSet = firstSet intersect secSet
    assert(resultSet contains 3)
    assert(resultSet contains 5)
    assert((resultSet contains 1)  === false)
    assert((resultSet contains 2)  === false)
    assert((resultSet contains 4)  === false)
    assert((resultSet contains 6)  === false)
    assert((resultSet contains 7)  === false)

    val thirdSet = new EmptySet incl 8 incl 9
    assert((firstSet intersect thirdSet).isEmpty)
  }

}
