package exercise7

import common.UnitSpec

class ConvertToStringListTest extends UnitSpec {

  "Convert Strings" should "Convert Strings List to Letter List" in {
    val convertStringList = new ConvertStringList
    val result = convertStringList.convert(List("Apple", "Orange", "Banana"))
    assert(result.size === 17)
    assert(result(0) === "A")
    assert(result(9) === "g")
    assert(result(16) === "a")
  }

}
