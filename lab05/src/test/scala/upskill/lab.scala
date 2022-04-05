package upskill
import scala.language.adhocExtensions
import org.scalatest.funsuite.AnyFunSuite

import java.math.BigInteger

class labTest extends AnyFunSuite:
  test("f") {
    assert(lab.f(lab.g1,1,1 )===1)
    assert(lab.f(lab.g2,1,1 )===2)
    assert(lab.f(lab.g3,1,1 )===3)
    assert(lab.f(lab.g4,1,1 )=== 1)
    assert(lab.f(lab.g1,1,2 )===3)
    assert(lab.f(lab.g2,1,2 )===5)
    assert(lab.f(lab.g3,1,2 )===7)
    assert(lab.f(lab.g4,1,2 )=== 5)
    assert(lab.f(lab.g1,1,3 )===6)
    assert(lab.f(lab.g2,1,3 )===9)
    assert(lab.f(lab.g4,1,3 )=== 14)
    assert(lab.f(lab.g1 andThen lab.g2 andThen lab.g3,1,2 )===9)
    assert(lab.f(lab.g1 andThen lab.g2 andThen lab.g3,1,3 )===15)
    assert(lab.f(lab.g5,1,2 )===9)
    assert(lab.f(lab.g5,1,3 )===15)

  }

  test("fStr") {
    assert(lab.fStr(lab.fStr1,"Programacao Funcional" )==="PROGRAMACAO FUNCIONAL")
    assert(lab.fStr(lab.fStr1,"PROGRAMACAO FUNCIONAL" )==="PROGRAMACAO FUNCIONAL")
    assert(lab.fStr(lab.fStr2,"PROGRAMACAO FUNCIONAL" )==="programacao funcional")
    assert(lab.fStr(lab.fStr3,"Programacao Funcional" )==="PROGRAMACAO FUNCIONALprogramacao funcional")
    assert(lab.fStr(lab.fStr4,"Programacao Funcional" )==="programacao funcionalPROGRAMACAO FUNCIONAL")

  }

