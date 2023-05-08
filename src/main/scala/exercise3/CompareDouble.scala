package exercise3

class CompareDouble {

  implicit var precision: Double = 0.01

  def ~= (firstValue: Double, secondValue: Double): Boolean = {
    (firstValue - secondValue).abs <= precision
  }

}
