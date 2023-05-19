package exercise9

case class Node(elem: Int, leftTree: IntTree, rightTree: IntTree) extends IntTree {

  def contains(key: Int): Boolean = {
    def findInNode(key: Int, intTree: IntTree): Boolean = intTree match {
      case EmptyTree => false
      case Node(v, left, right) =>
        if(key == v) return true
        if(key < v) findInNode(key, left)
        else findInNode(key, right)
    }
    findInNode(key, this)
  }

    def insert(v: Int): IntTree = {
      def insertNode(value: Int, intTree: IntTree): IntTree = intTree match {
          case EmptyTree => Node(value, EmptyTree, EmptyTree)
          case Node(v, left, right) =>
            if (v == value) Node(v, left, right)
            else if (value < v) Node(v, insertNode(value, left), right)
            else Node(v, left, insertNode(value, right))
      }
      insertNode(v, this)
    }

}
