package exercise14

class VectorArithmatic(vector: Vector[Double]) {

  private var resultVectors = Map.empty[String, Vector[Double]]
  private var resultValues = Map.empty[String, Double]

  def square(): Vector[Double] = {
    resultVectors.get("SQUARE").getOrElse({
      val resultVector = vector.map(item => item * item)
      resultVectors = resultVectors + ("SQUARE" -> resultVector)
      resultVector
    })
  }

  def sum(): Double =  {
    resultValues.get("SUM").getOrElse({
      val result: Vector[Double] = resultVectors.get("SQUARE").getOrElse(Vector.empty)
      val resultSum: Double = result.sum
      resultValues = resultValues + ("SUM" -> resultSum)
      resultSum
    })
  }

  def squareRoot(): Double = {
    resultValues.get("SQRT").getOrElse({
      val resultSum: Double = resultValues.get("SUM").getOrElse(0)
      val resultSqrt: Double = sqrt(1.0, resultSum)
      resultValues = resultValues + ("SQRT" -> resultSqrt)
      resultSqrt
    })

  }

  private def sqrt(sqrtGuess: Double, value: Double): Double =
    if (isClose(sqrtGuess, value)) sqrtGuess
    else sqrt(improveSqrtVal(sqrtGuess, value), value)

  private def isClose(sqrtGuess: Double, x: Double) =
    (sqrtGuess * sqrtGuess - x).abs < .001

  private def improveSqrtVal(guess: Double, x: Double) =
    (guess + x / guess) / 2

}
