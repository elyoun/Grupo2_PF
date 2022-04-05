import scala.annotation.tailrec

def stringstring(s1: String, s2: String) : String =
  s1 + " " + s2

def encryptTR(s:String) : String =

  def f(c1:Char) : Char =
    if ((c1=='z') && (c1 == 'Z')) (c1-25).toChar
    else (c1+1).toChar

  @tailrec
  def aux (acc: String, c:Char, n: Int) : String =
    if( n < s.length-1) aux(acc + f(c), s.charAt(n+1), n+1)
    else acc + f(c)


  aux("", s.charAt(0), 0)

def decryptTR(s:String) : String =

  def f(c1:Char) : Char =
    if ((c1=='a') && (c1 == 'A')) (c1-25).toChar
    else (c1-1).toChar

  @tailrec
  def aux (acc: String, c:Char, n: Int) : String =
    if( n < s.length-1) aux(acc + f(c), s.charAt(n+1), n+1)
    else acc + f(c)


  aux("", s.charAt(0), 0)

def secret (s: String) : String =
  encryptTR(stringstring (s, "PS: This is a secret"))

def desecret (s: String) : String =
  stringstring (decryptTR(s), "PS: This is a secret")

secret("ola eu sou o joao")
desecret("pmb!fv!tpv!p!kpbpQT;!Uijt!jt!b!tfdsfu")

def encryptNTimes(s: String, n: Int) : (String, Int) =
  def aux(s: String, n:Int) : String =
    if (n>1) aux(encryptTR(s),n-1)
    else encryptTR(s)
  (aux(s,n), s.count(_ == ' '))

def decryptNTimes(s: String, n: Int) : String =

  def regression (s: String, n: Int, c:Int) : Int =
    if (s.count(_ == ' ') == n) c
    else regression(s, n, c+1)

  def aux(s: String, n: Int) : String =
    if (n>1) aux(decryptTR(s),n-1)
    else decryptTR(s)

  aux(s, regression(s, n, 0))

def regression (s: String, n: Int, c:Int) : Int =
  if (s.count(_ == ' ') == n) c
  else regression(s, n, c+1)


def aux (s: String, n: Int) : String =
  if (n>1) aux(encryptTR(s),n-1)
  else encryptTR(s)

def countSpaces(s: String, n: Int) : Int =
  if (n >= s.length) 0
  else if (s.charAt(n) == ' ') 1 + countSpaces(s, n+1)
  else countSpaces(s, n+1)

def decryptNTimes2(s: String, n: Int) : String =
  if (n>1) decryptNTimes(decryptTR(s), n-1)
  else decryptTR(s)

encryptTR("ola eu sou o joao")
encryptNTimes("aaa a", 3)
112.toChar
decryptNTimes("rod#hx#vrx", 2)
112.toChar