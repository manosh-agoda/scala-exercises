package exercise9

abstract class IntTree {
  def contains(v: Int): Boolean
  def insert(v: Int): IntTree
}
