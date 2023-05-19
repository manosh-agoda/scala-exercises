package exercise8

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  def union(x: IntSet): IntSet = (left union (right union x)) incl elem

  def intersect(x: IntSet): IntSet = {
    val result = (right intersect x) union (left intersect x)
    if (x contains elem) result incl elem
    else result
  }

  def excl(x: Int): IntSet = {
    if (elem == x) left union right
    else if (elem < x) (left excl x) union right incl elem
    else left union (right excl x) incl elem
  }

  def isEmpty: Boolean = false


}
