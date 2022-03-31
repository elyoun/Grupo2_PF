
def formulaResolvente(a: Int, b: Int, c: Int): (Double, Double) =
  val r = math.sqrt(b*b-(4*a*c))
  ((-b+r)/(2*a),(-b-r)/(2*a))

formulaResolvente(1,4,-21)


def testStr(a: String): String =
  if(a.startsWith("STR_")) a.substring(4)
  else a

testStr("STR_ola")
testStr("STRola")

def toCelsius(t: Double, u: Char): Double =
  if(u=='c') t
  else if (u == 'f') (t-32)/1.8
  else if (u == 'k') t - 273.15
  else 0

toCelsius(23,'c')
toCelsius(23,'f')
toCelsius(2375,'k')
toCelsius(2375,'v')
toCelsius(104, 'f')

assert(toCelsius(104.0, 'f') == 40.0)

def numberOfSpaces (s: String): Int =
  //s.filter(_ == ' ').size
  s.filter(c => c.isSpaceChar).size

numberOfSpaces("dW ew e ")
numberOfSpaces(" ")

def upMe (s: String): String =
  s.map(c => c.toUpper)

upMe("oLa")
upMe(" ")

