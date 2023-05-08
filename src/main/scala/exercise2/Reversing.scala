package exercise2

import exercise1.MyQueueWithArray
import exercise1.Queue

trait Reversing extends Queue[String] {
  abstract override def put(item: String): Unit = super.put(item.reverse)
}
