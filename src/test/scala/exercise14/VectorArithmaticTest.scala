package exercise14

import common.UnitSpec

class VectorArithmaticTest extends UnitSpec {

  "Vector Arithmatic" should "Square All Numbers, Sum and SQRT" in {
    val vectorArithmatic = new VectorArithmatic(Vector(2, 3, 4))
    assert(vectorArithmatic.square === Vector(4, 9, 16))
    assert(vectorArithmatic.sum === 29)
    assert(vectorArithmatic.squareRoot() === 5.385229413227739)
  }


}
