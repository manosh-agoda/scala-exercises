package exercise8

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(x: IntSet): IntSet
  def intersect(x: IntSet): IntSet
  def isEmpty: Boolean
  def excl(x: Int): IntSet
}
