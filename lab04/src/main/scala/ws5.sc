import scala.annotation.tailrec

def decryptTR(s:String) : String =

  def f(c1:Char) : Char =
    if ((c1=='a') && (c1 == 'A')) (c1-25).toChar
    else (c1-1).toChar

  @tailrec
  def aux (acc: String, c:Char, n: Int) : String =
    if( n < s.length-1) aux(acc + f(c), s.charAt(n+1), n+1)
    else acc + f(c)


  aux("", s.charAt(0), 0)

def decrypt2 (s: String, n: Int): String=
  @tailrec
  def aux(s: String): String =
    if (s.count(_ == ' ') == n) s else aux(decryptTR(s))
  aux(s)

decrypt2("bbb!ccc", 1)