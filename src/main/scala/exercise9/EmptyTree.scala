package exercise9

case object EmptyTree extends IntTree {
  def contains(v: Int): Boolean = false

  def insert(v: Int): IntTree = Node(v, EmptyTree, EmptyTree)
}
