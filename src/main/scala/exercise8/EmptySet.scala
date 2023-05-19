package exercise8

class EmptySet extends IntSet{
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  def union(x: IntSet) = x
  def intersect(x: IntSet) = new EmptySet
  def isEmpty: Boolean = true
  def excl(x: Int): IntSet = this
}
