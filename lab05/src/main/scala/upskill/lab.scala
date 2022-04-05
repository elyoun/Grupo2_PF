package upskill

import scala.annotation.tailrec

object lab:

  def f(f1: Int => Int, a: Int, b: Int) : Int=

    @scala.annotation.tailrec
    def fAux(x: Int, acc: Int): Int =
      if (x > b) acc
      else fAux(x + 1, acc + f1(x))

    fAux(a,0 )


  def g1(x: Int): Int = x

  def g2(x: Int): Int = x+1

  def g3(x: Int): Int = x+2

  def g4(x: Int): Int = x*x

  def g5(x: Int): Int = g3(g2(g1(x)))

  def fStr(f: String => String, str: String) = f(str)

  def fStr1(str: String) = str.toUpperCase()
  def fStr2(str: String) = str.toLowerCase()
  def fStr3(str: String) = str.toUpperCase() + str.toLowerCase()
  def fStr4(str: String) = str.toLowerCase() + str.toUpperCase()
