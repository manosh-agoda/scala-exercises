package exercise12

class MultiplyFromMapValues {

  def multiply(list: List[Int], map: Map[Int, Double]): List[Double] = {
    list.map(listVal => {
      val mapValue  = map.get(listVal)
      if(mapValue.isDefined) listVal * mapValue.get
      else 0.0
    }).filter(_ != 0.0)
  }

}
