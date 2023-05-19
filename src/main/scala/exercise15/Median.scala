package exercise15

class Median {

  def findForIntSeq(seqInt: Seq[Int]): Double = {
    val sortedSeq = seqInt.sorted
    val seqSize = sortedSeq.size
    val middle = seqSize/2
    if(seqSize % 2 == 1) sortedSeq(middle)
    else {
      (sortedSeq(middle).toDouble + sortedSeq(middle - 1))/2
    }
  }

  def find[T: Ordering, F](seqInt: Seq[T])(implicit conversion:T => F, f: Fractional[F]): F = {
    val sortedSeq = seqInt.sorted
    val seqSize = sortedSeq.size
    val middle = seqSize / 2
    if (seqSize % 2 == 1) sortedSeq(middle)
    else {
      import f._
      (conversion(sortedSeq(middle)) + conversion(sortedSeq(middle - 1))) / fromInt(2)
    }
  }

}
