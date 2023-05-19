package exercise15

import common.UnitSpec
class MedianTest extends UnitSpec {

  "Median" should "Be Middle Value after Sorted" in {
    assert(new Median().findForIntSeq(Seq(3,4,2,5,1)) === 3)
    assert(new Median().findForIntSeq(Seq(3,6,4,2,5,1)) === 3.5)

    assert(new Median().find[Int, Double](Seq(3,4,2,5,1)) === 3)
    assert(new Median().find[Double, Double](Seq(3,4,2,5,1)) === 3)

    assert(new Median().find[Int, Double](Seq(3,6,4,2,5,1)) === 3.5)
    assert(new Median().find[Double, Double](Seq(3,6,4,2,5,1)) === 3.5)
  }

}
