package exercise2

import common.UnitSpec
import exercise1.MyQueueWithArray
class QueueWithReversingTest extends UnitSpec {

  "A Queue with Reversing" should "pop values in first-in-first-out order with strings reversed" in {
    val myQueue = new MyQueueWithArray with Reversing {}
    myQueue.put("One")
    myQueue.put("Two")
    assert(myQueue.get === "enO")
    assert(myQueue.get === "owT")
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

  "A Queue with Reversing" should "pop values in first-in-first-out order even when put and get alternatively" in {
    val myQueue = new MyQueueWithArray
    myQueue.put("One")
    assert(myQueue.get === "One")
    myQueue.put("Two")
    assert(myQueue.get === "Two")
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

  "A Queue with Reversing" should "Give an exception when Empty" in {
    val myQueue = new MyQueueWithArray
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

}
