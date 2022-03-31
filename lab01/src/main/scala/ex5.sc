/* 1)


def formulaResolvente(a:Int, b:Int, c:Int): (Double, Double) =
  val r = math.sqrt(math.pow(b, 2) - 4*a*c)
  ((-b + r)/(2*a), (-b -r)/(2*a))


assert (formulaResolvente(1, 4, -21) == (3.0, -7.0))
if (formulaResolvente(1, 4, -21) == (3.0, -7.0)) "Correu" else "Nope!"

 */


/* 2)

def removeStr(s:String): String =

  if (s.startsWith("STR_")) s.substring(4) else s


assert(removeStr("abc") == "abc")
assert(removeStr("") == "")
assert(removeStr("oinfweiv") == "oinfweiv")
assert(removeStr("STR_abc") == "abc")
assert(removeStr("STR_") == "")

removeStr("abc")
removeStr("STR_ENGTH")

*/


/* 3)

def converte(t: Double, unidade: String): Double =

  if (unidade == "C") t else if (unidade == "F") (t-32)/1.8 else t-273.15

assert(converte(10.0, unidade = "C") == 10.0)
assert(converte(0.0, unidade = "C") == 0.0)
assert(converte(104.0, unidade = "F") == 40.0)
assert(converte(212.0, unidade = "F") == 100.0)
assert(converte(0.0, unidade = "K") == -273.15)
assert(converte(200.0, unidade = "K") - (-73.15) < 0.00001)  // por causa dos arredondamentos

*/

/* 4)

def countStr(s:String): Int =

  val spaces = s.filter(c => c == ' ')  // (c => c == ' ') é o mm que (c => c.isSpaceChar)
  spaces.size


assert(countStr("ola") == 0)
assert(countStr("1234567890") == 0)
assert(countStr("") == 0)
assert(countStr("A minha casinha") == 2)
assert(countStr("   ") == 3)
assert(countStr("A E I O U") == 4)

countStr("A E I O U")
countStr("A minha casinha")
countStr("   ")
countStr("")

*/

/* 5)

def upStr(s: String): String =

  s.map(c => c.toUpper)

upStr("abc")
upStr("aBc")
upStr("a E i O u")

*/