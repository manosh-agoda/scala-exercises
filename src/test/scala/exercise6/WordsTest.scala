package exercise6

import common.UnitSpec

class WordsTest extends UnitSpec {

  "Words" should "Find Longest Word" in {
    val words = new Words
    assert(words.findLongestWord("Given a string containing words separated by space find The longest word") === "containing")
  }

  "Words" should "Find The Most Common Word" in {
    val words = new Words
    assert(words.findMostCommonWord("and a for me is and me a is are for is me is") === "is")
  }

  "Words" should "Find The Most Common Letter" in {
    val words = new Words
    assert(words.findMostCommonLetter("i and a for me is and me a is are for is me is is is") === "i")
  }

  "Words" should "To Letter Word Map" in {
    val words = new Words
    val mapOfLetterToWords = words.createAMapOfLetterToWords("i and a for me is and me a is are for is me is is is")
    assert(mapOfLetterToWords("i").mkString(",") === "i,is")
    assert(mapOfLetterToWords("a").mkString(",") === "and,a,are")
    assert(mapOfLetterToWords("n").mkString(",") === "and")
    assert(mapOfLetterToWords("d").mkString(",") === "and")
    assert(mapOfLetterToWords("m").mkString(",") === "me")
    assert(mapOfLetterToWords("e").mkString(",") === "me,are")
    assert(mapOfLetterToWords("s").mkString(",") === "is")
  }

}
