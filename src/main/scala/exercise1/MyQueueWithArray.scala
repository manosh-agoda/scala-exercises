package exercise1

import scala.collection.mutable.ArrayBuffer

class MyQueueWithArray extends Queue[String] {
  private var items: ArrayBuffer[String] = new ArrayBuffer[String]()
  override def get: String = {
    if(items.size == 0) {
      throw new NoSuchElementException("Empty Queue")
    } else {
      val item = items(0)
      items = items.drop(1)
      item
    }
  }
  override def put(item: String) = {
    items = items += item
  }
}
