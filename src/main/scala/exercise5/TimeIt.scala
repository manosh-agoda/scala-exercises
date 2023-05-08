package exercise5

class TimeIt {

  def findExecutionTime(function: Any) = {
    val startTime = System.nanoTime
    val result = function
    val duration = System.nanoTime - startTime
    println("Run Time In Nano Seconds = " + duration)
    result
  }

}
