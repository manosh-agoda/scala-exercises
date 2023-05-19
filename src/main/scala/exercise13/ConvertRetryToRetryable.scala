package exercise13

class ConvertRetryToRetryable {

  def retry(function: => Any)(implicit retryCount: Int, sleepTime: Int): Any = {
    try {
      function
    } catch {
      case e: Throwable =>
        if (retryCount > 0) {
          val newRetryCount: Int = retryCount - 1
          Thread.sleep(sleepTime)
          retry(function)(newRetryCount, sleepTime)
        } else throw e
    }
  }

}
