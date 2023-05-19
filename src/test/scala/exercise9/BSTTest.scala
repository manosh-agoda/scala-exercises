package exercise9

import common.UnitSpec
class BSTTest extends UnitSpec {

  "BST" should "Have Inserted values" in {
    val bst = EmptyTree insert 20 insert 10 insert 5 insert 30 insert 15 insert 24
    assert(bst contains 15)
  }

  "BST" should "Do not Have Inserted values" in {
    val bst = EmptyTree insert 20 insert 10 insert 5 insert 30 insert 15 insert 24
    assert((bst contains 16) == false)
  }

}
