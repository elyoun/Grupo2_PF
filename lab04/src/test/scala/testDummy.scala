import scala.language.adhocExtensions
import org.scalatest.funsuite.AnyFunSuite

class testDummy extends AnyFunSuite:

  test("encryptTR1"){
    val input = "bbb"
    val expected = "ccc"
    assert(Dummy.encryptTR(input) === expected)
  }

  test("encryptTR2"){
    val input = "ola"
    val expected = "pmb"
    assert(Dummy.encryptTR(input) === expected)
  }

  test("encryptTR3"){
    val input = " "
    val expected = "!"
    assert(Dummy.encryptTR(input) === expected)
  }
