package exercise1

trait Queue[String] {
  def get: String
  def put(item: String)
}
