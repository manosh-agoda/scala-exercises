package exercise11

class OptionalExercise {

  def getFirstNotNone[T](x: Option[T], y: Option[T], z: Option[T]): T = x.getOrElse(y.getOrElse(z.get))

  def getProduct(x: Option[Int], y: Option[Int], z: Option[Int]): Int = {
    x.getOrElse(0) * y.getOrElse(0) * z.getOrElse(0)
  }

  def getFirstNotNoneFromSequence(seq: Seq[Option[Any]]): Any = {
    seq.filter(x => !x.isEmpty)(0).get
  }

}
