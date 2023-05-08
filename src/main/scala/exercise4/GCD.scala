package exercise4

import scala.annotation.tailrec

class GCD {

  @tailrec
  final def compute(firstVal: Int, secondVal: Int): Int = {
    if(secondVal == 0) firstVal else compute(secondVal, firstVal % secondVal)
  }

}
