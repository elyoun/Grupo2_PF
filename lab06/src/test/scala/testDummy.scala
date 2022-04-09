import scala.language.adhocExtensions
import org.scalatest.funsuite.AnyFunSuite

class testDummy extends AnyFunSuite:

  val meiESOFT = List("TAP", "ESEGI", "SOCOF", "EDOM", "SINFE", "INDES", "SIMOV", "GEPEE", "ARQSOFT", "ODSOFT", "QESOFT", "INSIS", "EINOV", "LABDSOFT", "TMDEI")
  val frutos = List("BANANA", "MORANGO", "LARANJA", "ANANAS", "ABACATE")


//1 lengthElements
  test("lengthElements") {
    val input = meiESOFT
    val expected = List(3, 5, 5, 4, 5, 5, 5, 5, 7, 6, 6, 5, 5, 8, 5)
    assert(Dummy.lengthElements(input) === expected)
  }
  test("lengthElements2") {
    val input = frutos
    val expected = List(6, 7, 7, 6, 7)
    assert(Dummy.lengthElements(input) === expected)
  }

  //2 findSubstrings
  test("findSubstrings1") {
    val input1 = meiESOFT
    val input2 = "SOFT"
    val expected = List("ARQSOFT", "ODSOFT", "QESOFT", "LABDSOFT")
    assert(Dummy.findSubstrings(input1, input2) === expected)
  }
  test("findSubstrings2") {
    val input1 = frutos
    val input2 = "ANA"
    val expected = List("BANANA", "ANANAS")
    assert(Dummy.findSubstrings(input1, input2) === expected)
  }

  //3 doubleList
  test("doubleList1") {
    val input = List(2, 1, 4, 5)
    val expected = List(4, 2, 8, 10)
    assert(Dummy.doubleList(input) === expected)
  }
  test("doubleList2") {
    val input = List(8, 3, 6, 0)
    val expected = List(16, 6, 12, 0)
    assert(Dummy.doubleList(input) === expected)
  }
  test("doubleList3") {
    val input = List()
    val expected = List()
    assert(Dummy.doubleList(input) === expected)
  }

  //4 sumCubes2
  test("sumCubes21") {
    val input1 = 0
    val input2 = 2
    val expected = 9
    assert(Dummy.sumCubes2(input1, input2) === expected)
  }
  test("sumCubes22") {
    val input1 = 0
    val input2 = 3
    val expected = 36
    assert(Dummy.sumCubes2(input1, input2) === expected)
  }
  test("sumCubes23") {
    val input1 = 0
    val input2 = 0
    val expected = 0
    assert(Dummy.sumCubes2(input1, input2) === expected)
  }

  //5 constructList
  test("constructList") {
    val input = List(("a",1), ("b",2),("abba",3), ("a",2))
    val expected = List("a", "b", "b", "abba", "abba", "abba", "a", "a")
    assert(Dummy.constructList(input) === expected)
  }

  //6 duplicateDigits
  test("duplicateDigits") {
    val input = List(1,2,3,4,5,6,7,8,9,10,11,345)
    val expected = List(11, 22, 33, 44, 55, 66, 77, 88, 99, 1010, 1111, 345345)
    assert(Dummy.duplicateDigits(input) === expected)
  }
  test("duplicateDigits0") {
    val input = List(0,65,0)
    val expected = List(0, 6565, 0)
    assert(Dummy.duplicateDigits(input) === expected)
  }
