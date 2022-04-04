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


def decryptNTimes(s: String, n: Int) : String =

  def regression (s: String, n: Int, c:Int) : Int =
    if (s.count(_ == ' ') == n) c
    else regression(decryptTR(s), n, c+1)

  def aux(s: String, n: Int) : String =
    if (n>1) aux(decryptTR(s),n-1)
    else decryptTR(s)

  aux(s, regression(s, n, 0))

def regression (s: String, n: Int, c:Int) : Int =
  if (s.count(_ == ' ') == n) c
  else regression(decryptTR(s), n, c+1)


regression("ola#eu#sou", 2, 0)
decryptNTimes("rod#hx#vrx", 2)