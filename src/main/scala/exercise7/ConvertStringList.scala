package exercise7

class ConvertStringList {

  def convert(strings: List[String]): List[String] = {
    strings.flatten.map(charVal => charVal.toString)
  }

}
