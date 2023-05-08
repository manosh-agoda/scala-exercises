package exercise1

import common.UnitSpec
class MyQueueTest extends UnitSpec {

  "A Queue" should "pop values in first-in-first-out order" in {
    val myQueue = new MyQueue
    myQueue put "One"
    myQueue put "Two"
    assert(myQueue.get === "One")
    assert(myQueue.get === "Two")
    assertThrows[NoSuchElementException]{
      myQueue.get
    }
  }

  "A Queue" should "pop values in first-in-first-out order even when put and get alternatively" in {
    val myQueue = new MyQueue
    myQueue put "One"
    assert(myQueue.get === "One")
    myQueue put "Two"
    assert(myQueue.get === "Two")
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

  "A Queue" should "Give an exception when Empty" in {
    val myQueue = new MyQueue
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

}
