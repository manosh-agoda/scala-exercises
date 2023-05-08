package exercise1

import common.UnitSpec

class MyQueueWithArrayTest extends UnitSpec {

  "A Queue" should "pop values in first-in-first-out order" in {
    val myQueue = new MyQueueWithArray
    myQueue put "One"
    myQueue put "Two"
    assert(myQueue.get === "One")
    assert(myQueue.get === "Two")
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

  "A Queue" should "pop values in first-in-first-out order even when put and get alternatively" in {
    val myQueue = new MyQueueWithArray
    myQueue put "One"
    assert(myQueue.get === "One")
    myQueue put "Two"
    assert(myQueue.get === "Two")
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

  "A Queue" should "Give an exception when Empty" in {
    val myQueue = new MyQueueWithArray
    assertThrows[NoSuchElementException] {
      myQueue.get
    }
  }

}
