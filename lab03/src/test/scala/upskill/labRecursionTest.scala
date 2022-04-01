package upskill
import scala.language.adhocExtensions
import org.scalatest.funsuite.AnyFunSuite

import java.math.BigInteger

class labRecursionTest extends AnyFunSuite:
  test("sumFirstNumber") {
    assert(labRecursion.sumFirstNumbers(3)===6)
    assert(labRecursion.sumFirstNumbers(2)===3)
    assert(labRecursion.sumFirstNumbers(1)===1)
    assert(labRecursion.sumFirstNumbers(-1)=== -1)
  }
  test("repeatChar") {
    assert(labRecursion.repeatChar('a',3)==="aaa")
  }

  test("repeatNumber") {
    assert(labRecursion.repeatNumber(1,3)==="111")
    assert(labRecursion.repeatNumber(2,4)==="2222")
    assert(labRecursion.repeatNumber(3,0)==="3")
    assert(labRecursion.repeatNumber(31,2)==="3131")
  }

  test("repeatString") {
    assert(labRecursion.repeatString("sapo",3)==="saposaposapo")
    assert(labRecursion.repeatString("",4)==="")
    assert(labRecursion.repeatString("sapo",0)==="sapo")
  }

  test("factorial") {
    assert(labRecursion.factorial(3)===6)
    assert(labRecursion.factorial(4)===24)
  }

  test("sumFirstNumberTR") {
    assert(labRecursion.sumFirstNumbersTR(3)===6)
    assert(labRecursion.sumFirstNumbersTR(2)===3)
    assert(labRecursion.sumFirstNumbersTR(1)===1)
    assert(labRecursion.sumFirstNumbersTR(-1)=== -1)
  }
  test("repeatCharTR") {
    assert(labRecursion.repeatCharTR('a',3)==="aaa")
  }

  test("repeatNumberTR") {
    assert(labRecursion.repeatNumberTR(1,3)==="111")
    assert(labRecursion.repeatNumberTR(2,4)==="2222")
    assert(labRecursion.repeatNumberTR(3,0)==="3")
    assert(labRecursion.repeatNumberTR(31,2)==="3131")
  }

  test("repeatStringTR") {
    assert(labRecursion.repeatStringTR("sapo",3)==="saposaposapo")
    assert(labRecursion.repeatStringTR("",4)==="")
    assert(labRecursion.repeatStringTR("sapo",0)==="sapo")
  }

  test("factorialTR") {
    assert(labRecursion.factorialTR(3)===6)
    assert(labRecursion.factorialTR(4)===24)
  }