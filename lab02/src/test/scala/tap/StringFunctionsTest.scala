package tap

import org.scalatest.funsuite.AnyFunSuite

class StringFunctionsTest extends AnyFunSuite:

  test("testRemoveDigits 1") {

    val input = "a1b2c3"
    val expected = "abc"

    assert(StringFunctions.removeDigits(input) === expected)

  }

  test("testRemoveDigits 2") {

    val input = "A casa n. 31 fica no Porto"
    val expected = "A casa n.  fica no Porto"

    assert(StringFunctions.removeDigits(input) === expected)

  }

  test("testRemoveDigits 3") {

    val input = "caravela"
    val expected = "caravela"

    assert(StringFunctions.removeDigits(input) === expected)

  }



  test("testIncDigits1") {

    val inputStr = "abc"
    val inputInt = 2
    val expected = "abc"

    assert(StringFunctions.incDigits(inputStr, inputInt) === expected)

  }

  test("testIncDigits2") {

    val inputStr = "que fixe"
    val inputInt = 2
    val expected = "que fixe"

    assert(StringFunctions.incDigits(inputStr, inputInt) === expected)

  }

  test("testIncDigits3") {

    val inputStr = "1258"
    val inputInt = 2
    val expected = "347:"  // dá "347:" porque os dois pontos é o 10 em ASCII (8+2)

    assert(StringFunctions.incDigits(inputStr, inputInt) === expected)

  }

