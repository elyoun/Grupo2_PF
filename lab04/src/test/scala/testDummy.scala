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

  test("encryptTR3") {
    val input = " "
    val expected = "!"
    assert(Dummy.encryptTR(input) === expected)
  }

  test("decryptTR1"){
    val input = "ccc"
    val expected = "bbb"
    assert(Dummy.decryptTR(input) === expected)
  }

  test("decryptTR2"){
    val input = "pmb"
    val expected = "ola"
    assert(Dummy.decryptTR(input) === expected)
  }

  test("decryptTR3"){
    val input = "pmb!fv!tpv!p!kpbp"
    val expected = "ola eu sou o joao"
    assert(Dummy.decryptTR(input) === expected)
  }

  test("stringstring1"){
    val input1= "ola"
    val input2 = "adeus"
    val expected = "ola adeus"
    assert(Dummy.stringstring(input1, input2) === expected)
  }

  test("stringstring2"){
    val input1= ""
    val input2 = ""
    val expected = " "
    assert(Dummy.stringstring(input1, input2) === expected)
  }

  test("secret1"){
    val input = "ola eu sou o joao"
    val expected = "pmb!fv!tpv!p!kpbp!QT;!Uijt!jt!b!tfdsfu"
    assert(Dummy.secret(input) === expected)
  }

  test("secret2"){
    val input = ""
    val expected = "!QT;!Uijt!jt!b!tfdsfu"
    assert(Dummy.secret(input) === expected)
  }

  test("desecret1"){
    val input = "pmb!fv!tpv!p!kpbp"
    val expected = "ola eu sou o joao PS: This is a secret"
    assert(Dummy.desecret(input) === expected)
  }


  test("encryptNtimes1"){
    val input1 = "ola eu sou o joao"
    val input2 = 3
    val expected = ("rod#hx#vrx#r#mrdr",4)
    assert(Dummy.encryptNTimes(input1, input2) === expected)
  }

  test("encryptNtimes2"){
    val input1 = "ola eu sou o luis"
    val input2 = 0
    val expected = ("ola eu sou o luis",4)
    assert(Dummy.encryptNTimes(input1, input2) === expected)
  }

  test("encryptNtimes3"){
    val input1 = " "
    val input2 = 3
    val expected = ("#",1)
    assert(Dummy.encryptNTimes(input1, input2) === expected)
  }

  test("decrypt21"){
    val input1 = "bbb!ccc"
    val input2 = 1
    val expected = "aaa bbb"
    assert(Dummy.decrypt2(input1, input2) === expected)
  }
  test("decrypt22"){
    val input1 = "wrs#vhfuhw#phvvdjh"
    val input2 = 2
    val expected = "top secret message"
    assert(Dummy.decrypt2(input1, input2) === expected)
  }
  test("decrypt23"){
    val input1 = "Juxsr#5#iru#wkh#zlq"
    val input2 = 4
    val expected = "Grupo 2 for the win"
    assert(Dummy.decrypt2(input1, input2) === expected)
  }

