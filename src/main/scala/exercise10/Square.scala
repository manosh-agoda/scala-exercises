package exercise10

class Square {

  def squareListWithCaseMatching(xs: List[Int]): List[Int] = xs match {
    case List() => Nil
    case y :: ys => y * y :: squareListWithCaseMatching(ys)
  }

  def squareListWithMap(xs: List[Int]): List[Int] = {
    xs map (x => x * x)
  }

}
