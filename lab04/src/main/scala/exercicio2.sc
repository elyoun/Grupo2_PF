import scala.annotation.tailrec

def decryptTR(s:String) : String =

  def f(c1:Char) : Char =
    if (c1=='a') 'z'
    else (c1-1).toChar

  @tailrec
  def aux (acc: String, c:Char, n: Int) : String =
    if( n < s.length-1) aux(acc + f(c), s.charAt(n+1), n+1)
    else acc + f(c)


  aux("", s.charAt(0), 0)


def decryptTR2(s: String): String =
  def f(c1:Char) : Char =
    if (c1=='a') 'z'
    else (c1-1).toChar
  s.map(f)

decryptTR("abc")
decryptTR2("abc")
