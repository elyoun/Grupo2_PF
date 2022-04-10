def strCompare(x: String, str: String, n1: Int, n2: Int) : String =
  if (n2 > str.length-1) x
  else if(x.charAt(n1) == str.charAt(n2)) strCompare(x, str, n1+1, n2+1)
  else if (x.charAt(n1) != str.charAt(n2)) strCompare(x, str, n1+1, n2)
  else ""

def startsWithAux(s1: String, s2: String, n: Int): Boolean =
  if (n >= s2.size) true
  else if (s1.charAt(n) != s2.charAt(n)) false
  else startsWithAux(s1,s2,n+1)


def startsWith(h: String, str: String): Boolean =

  def startsWithAux(s1: String, s2: String, n: Int): Boolean =

    if (n >= s2.size) true
    else if (s1.charAt(n) != s2.charAt(n)) false
    else startsWithAux(s1,s2,n+1)

  if(h.size < str.size) false
  else startsWithAux(h, str, 0) || startsWith(h.tail,str)

def numberOfDuplicates (l: List[String]) : List[(String, Int)] =
  l match
    case Nil => Nil
    case (h::t) => (h, l.count(n => n ==h)) :: numberOfDuplicates(l.filterNot(n => n==h))

def numberOfDuplicatesTR (l: List[String]) : List[(String, Int)] =

  def aux(l: List[String], acc: List[(String, Int)]) : List[(String, Int)] =

    l match
      case Nil =>  acc.reverse
      case (h::t) => aux(l.filterNot(_ == h), (h,l.filter(_ == h).size) :: acc)

  aux(l, List())

def unConstructListTR(l : List[String]) : List[(String, Int)]=

  def aux (l: List[String], acc: List[(String, Int)]) : List[(String, Int)] =

    l match
      case Nil => acc
      case (h::t) =>
        val (x,y) = l.span(_ == h)
        aux(y, (h, x.size) :: acc)

  aux (l, List())

val list5 = List("a", "b", "b", "abba", "abba", "abba", "a", "a")
unConstructListTR(list5)
val (x,y) = list5.span(_ == "a")
(x,y)


def groupInListTR[T](xs: List[T]): List[List[T]]=

  def aux [T] (xs: List[T], acc: List[List[T]]): List[List[T]] =
    xs match
      case Nil => acc.reverse
      case h::t =>
        val (x,y) = xs.span(_ == h)
        aux(y, x :: acc)

  aux(xs, Nil)

groupInListTR(List("a", "b", "b", "abba", "abba", "abba", "a", "a"))
groupInListTR(List(1, 22, 22, 22, 2222, 2222, 1, 22))