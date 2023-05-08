package exercise1

class MyQueue extends Queue[String] {
  private var items: List[String] = List()
  override def get: String = {
    if(items.size > 0) {
      val lastItem = items.last
      items = items.init
      lastItem
    } else {
      throw new NoSuchElementException("Empty Queue")
    }
  }
  override def put(item: String) =
    items = item :: items
}
