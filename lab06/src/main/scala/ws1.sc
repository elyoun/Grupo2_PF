import scala.annotation.tailrec
//Exercises

val numbers1 = 1 :: (2 :: (3 ::Nil ))
val numbers2 = 1 :: 2 :: 3 ::Nil
//val numbers1a = (1 :: 2 ):: 3 ::List()
val list1 = List ("TAP","ESEGI","SOCOF","EDOM","SINFE","INDES","SIMOV","GEPEE","ARQSOFT","ODSOFT","QESOFT","INSIS")
val list2 = List("EINOV","LABDSOFT","TMDEI")
val list3 = list1 ::: list2
val list4 = List(list1, list2)

//1. They provide the same results
//   Yes

val today = List("April", 12, 2016)

List.range(1, 9, 2)
List.range(9, 1, -3)
List.fill(5)(1*1)



def squareNCounts(count: Int) =
  List.tabulate(count)(n => List.fill(count)(n*n))

squareNCounts(5)


def semester(course: String)=
  course match
    case "EDOM" => "1st semester"
    case "TAP" => "2nd semester"
    case c => "Unknown course: "+ c

semester("ARQSOFT")

def lengthElements(x: List[String])=
  x.map(s => s.length)

lengthElements(list3)

def findSubstrings(x: List[String], str: String)=
  def aux(s: String, str: String): Boolean =
    if (s == str) true
    else if (s.length < str.length) false
    else aux(s.tail, str)

  x.filter(s => aux(s, str))


findSubstrings(list3, "SOFT")

def doubleList(xs: List[Int]): List[Int]=
  xs match
    case Nil=> Nil
    case h::t => h*h :: doubleList(t)

doubleList(numbers1)

def constructList(xs: List[(String, Int)]):List[String]=xs match
  case Nil => Nil
  case (x,y):: xs1=> List.fill(y)(x) ::: constructList(xs1)

constructList(List(("a",1), ("b",2),("abba",3), ("a",2)))

def duplicateDigits(xs: List[Int]): List[Long]=

  xs match
  case Nil => Nil
  case x::ys => (x.toString + x.toString).toLong :: duplicateDigits(ys)

duplicateDigits(List(1,2,3,4,5,6,7,8,9,10,11,345))

def sumCubes2(x: Int, y: Int)=
  @annotation.tailrec
  def fAux(acc: Int,xs: List[Int]): Int=
    xs match
      case Nil => acc
      case h::t => fAux(acc + (h*h*h),t)
  fAux(0, List.range(x,y+1))

sumCubes2(0,2)
List.range(0,3)

list3

def partitionByLength(xs: List[String], l: Int) =
  (xs.filter(s=> s.length == l) , xs.filterNot(s => s.length == l))

partitionByLength(list3, 4)

def myMkString(l: List[String]) : String =
  @tailrec
  def aux(acc: String, l: List[String]) : String=
    l match
      case Nil => acc
      case h::t => aux(acc + ", " + h, t)
  aux(l.head, l.tail)

def myMkString2(l: List[String]) : String =
  l match
    case Nil => ""
    case l => l.reduceLeft(_ + ", " + _).toUpperCase()

myMkString(list3)
myMkString2(list3)
myMkString2(List())

def groupInList[T](xs: List[T]): List[List[T]]=

  xs match
  case Nil => Nil
  case h::t => (h::t).takeWhile(x => x == h ) :: groupInList((h::t).dropWhile(x => x == h))

groupInList(List("a","a","b","a", "a")).head.head
groupInList(List("a", "b", "b", "abba", "abba", "abba", "a", "a"))


def sumCubes (x: Int, y: Int) =
  List.range(x, y+1).map(s => s*s*s).reduceLeft(_+_)

sumCubes(0,2)


def unConstructList(l : List[String]) : List[(String, Int)]=
  l match
    case Nil => Nil
    case (h::t) => List((h, l.takeWhile(x => x == h ).size)) ::: unConstructList((h::t).dropWhile(x => x == h))


unConstructList(List("a", "b", "b", "abba", "abba", "abba", "a", "a"))
List("a", "b", "b", "abba", "abba", "abba", "a", "a").filter(n=> n == "a")

def numberOfDuplicates (l: List[String]) : List[(String, Int)] =
  l match
    case Nil => Nil
    case (h::t) => (h, l.count(n => n ==h)) :: numberOfDuplicates(l.filterNot(n => n==h))

numberOfDuplicates(List("a", "b", "b", "abba", "abba", "abba", "a", "a"))

def keepUnique [T](l: List[T]) : List[T] =
  l match
    case Nil => Nil
    case (h::t) => if (l.count(n => n == h) <= 1) List(h) ::: keepUnique(l.filterNot(n => n == h))
                   else keepUnique(l.filterNot(n => n == h))

//case l => if (l.filter(n => n == l.head).size <= 1) List(l.head) ::: keepUnique(l.filterNot(n => n == l.head)) else keepUnique(l.filterNot(n => n == l.head))


keepUnique(List("a", "b", "b", "abba", "abba", "abba", "a", "a", "y", "1"))
keepUnique(List(""))