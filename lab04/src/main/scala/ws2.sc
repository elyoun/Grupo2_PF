import scala.annotation.tailrec

def encrypt(s: String): String =
  def f(c:Char) : Char =
    if (c=='z') (c-25).toChar
    else (c+1).toChar
  s.map(f)

def encryptTR(s:String) : String =

  def f(c1:Char) : Char =
    if (c1=='z') (c1-25).toChar
    else (c1+1).toChar

  @tailrec
  def aux (acc: String, c:Char, n: Int) : String =
    if( n < s.length-1) aux(acc + f(c), s.charAt(n+1), n+1)
    else acc + f(c)


  aux("", s.charAt(0), 0)


def encryptR(s:String) : String =

  def f(c:Char) : Char =
    if (c=='z') (c-25).toChar
    else (c+1).toChar


  def aux( c:Char, n:Int) : String =
    if (n < s.length-1) f(c) + aux(s.charAt(n+1), n+1)
    else f(s.charAt(n)).toString

  aux (s.charAt(0), 0)


def f(c:Char) : Char =
  if (c=='z') (c-25).toChar
  else (c+1).toChar

f('a')
"abc".length
encrypt("ola ze")
encryptR("ola ze")
encryptTR("abc")
