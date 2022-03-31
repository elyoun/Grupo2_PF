package tap

import org.scalatest.funsuite.AnyFunSuite

class StringFunctionsTest extends AnyFunSuite:

  test("testRemoveDigits") {
      val input = "a1b2c3"
      val expected = "abc"
      assert( StringFunctions.removeDigits(input) === expected)
  }

  test("testRemoveDigits2"){
    val input = "a casa 31 fica no porto"
    val expected = "a casa  fica no porto"
    assert( StringFunctions.removeDigits(input) === expected)
  }

  test("testRemoveDigits3"){
    val input = "123"
    val expected = ""
    assert( StringFunctions.removeDigits(input) === expected)
  }

  test("testIncDigits") {
    val input1 = "ola2"
    val input2 = 4
    val expected = "ola6"
    assert( StringFunctions.incDigits(input1, input2) === expected)
  }

  test("testIncDigits2") {
    val input1 = "123"
    val input2 = 1
    val expected = "234"
    assert( StringFunctions.incDigits(input1, input2) === expected)
  }
  test("testIncDigits3") {
    val input1 = "asd"
    val input2 = 1
    val expected = "asd"
    assert( StringFunctions.incDigits(input1, input2) === expected)
  }



