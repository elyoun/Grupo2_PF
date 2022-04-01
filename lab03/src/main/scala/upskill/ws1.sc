def factorial(n: Long): Long =
  if (n == 0) 1 else n * factorial(n - 1)

def sumFirstNumbers(n: Int) : Long =
  if (n == 0) 0
  else if (n < 0) n + sumFirstNumbers(n+1)
  else n + sumFirstNumbers(n-1)

def repeatChar(c: Char, n: Int) : String =
  if(n==0) "" else c + repeatChar(c, n-1)

def repeatNumber(d: Int, n: Int) : String =
  if (n<=1) d + "" else d + repeatNumber(d, n-1)

def repeatString(s: String, n: Int) : String =
  if (n==1) s
  else if (n==0) s
  else s + repeatString(s, n-1)

def factorialTR(n: BigInt): BigInt =
  @scala.annotation.tailrec
  def fact_aux(acc:BigInt, n:BigInt):BigInt=
    if (n<=0) acc else fact_aux(acc*n,n-1)
  fact_aux(1,n)

def sumFirstNumbersTR(n: Int) : Long =
  @scala.annotation.tailrec
  def aux(x: Int, acc: Long): Long =
    if (x>0)
      aux(x-1,acc+x)
    else acc
  if (n>1) aux(n,0) else n

def repeatCharTR(c: Char, n: Int) : String =
  @scala.annotation.tailrec
  def aux(a: Char, b: Int, acc: String ) : String =
    if (b > 0) aux(a, b-1, acc+a)
    else acc
  aux(c, n, "")

def repeatNumberTR(d: Int, n: Int) : String=
    @scala.annotation.tailrec
    def aux(d2: Int, n2: Int, acc:String) : String=
      if (n2 > 0) aux(d2, n2-1, acc+d2)
      else acc
    aux(d,n,"")

def repeatStringTR(s: String, n: Int) : String=
  @scala.annotation.tailrec
  def aux(s2: String, n2: Int, acc:String) : String=
    if (n2 > 0) aux(s2, n2-1, acc+s2)
    else acc
  aux(s,n,"")

def sumFirstNumbersTR2(n: Int) : Int =
  @scala.annotation.tailrec
  def aux(x: Int, acc: Int) : Int =
    if (x>0) aux(x-1, acc+x)
    else acc
  aux(n, 0)




sumFirstNumbers(-1)
sumFirstNumbersTR(4)
sumFirstNumbersTR(4)
repeatChar('c', 4)
repeatCharTR('c', 4)
repeatCharTR('c', -4)
repeatNumber(1,-2)
repeatNumberTR(1,3)
repeatString("sapo", 3)
repeatStringTR("sapo", 3)
factorialTR(3)