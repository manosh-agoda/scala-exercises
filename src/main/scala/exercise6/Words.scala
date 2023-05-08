package exercise6

class Words {

  private val delimiter: String = " "

  def findLongestWord(words: String): String = {
    words.split(delimiter).maxBy(_.length)
  }

  def findMostCommonWord(words: String): String = {
    words.split(delimiter).groupBy(identity).maxBy(_._2.length)._1
  }

  def findMostCommonLetter(words: String): String = {
    words.split(delimiter).flatMap(word => word.toList).groupBy(identity).maxBy(_._2.length)._1.toString
  }

  def createAMapOfLetterToWords(words: String): Map[String, Set[String]] = {
    words.split(delimiter).flatMap(word => word.map(char => char.toString -> word)).groupMap(_._1)(_._2).map {
      case (key, value) => key -> value.toSet
    }
  }

}
