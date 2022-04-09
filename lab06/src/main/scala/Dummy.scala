import scala.annotation.tailrec

object Dummy:
  def stringToInt(s: String): Int = s.toInt

  def squareNCounts(count: Int) =
    List.tabulate(count)(n => List.fill(count)(n*n))

  def lengthElements(x: List[String])=
    x.map(s => s.length)

  def findSubstrings(x: List[String], str: String)=
    x.filter(s => s.contains(str))
    

  def doubleList(xs: List[Int]): List[Int]=
    xs match
      case Nil=> Nil
      case h::t => h*2 :: doubleList(t)

  def constructList(xs: List[(String, Int)]):List[String]=xs match
    case Nil => Nil
    case (x,y):: xs1=> List.fill(y)(x) ::: constructList(xs1)


  def duplicateDigits(xs: List[Int]): List[Long]=
    xs match
      case Nil => Nil
      case x::ys => (x.toString + x.toString).toLong :: duplicateDigits(ys)

  def sumCubes2(x: Int, y: Int)=
    @annotation.tailrec
    def fAux(acc: Int,xs: List[Int]): Int=
      xs match
        case Nil => acc
        case h::t => fAux(acc + (h*h*h),t)
    fAux(0, List.range(x,y+1))

  def partitionByLength(xs: List[String], l: Int) =
    (xs.filter(s=> s.length == l) , xs.filterNot(s => s.length == l))

  def myMkString(l: List[String]) : String =
    l match
      case Nil => ""
      case l => l.reduceLeft(_ + ", " + _)

  def groupInList[T](xs: List[T]): List[List[T]]=
    xs match
      case Nil => Nil
      case h::t => (h::t).takeWhile(x => x == h ) :: groupInList((h::t).dropWhile(x => x == h))

  /*def groupInList2[T](xs: List[T]): List[List[T]] =
    xs match
      case Nil => Nil
      case h :: t =>
        val (hs, ts) = t.span(s => s == h)
        (h:hs) :: groupInList2(ts)*/
  
  
  
  
  def sumCubes (x: Int, y: Int) =
    List.range(x, y+1).map(s => s*s*s).reduceLeft(_+_)

  def unConstructList(l : List[String]) : List[(String, Int)]=
    l match
      case Nil => Nil
      case (h::t) => List((h, l.takeWhile(x => x == h ).size)) ::: unConstructList((h::t).dropWhile(x => x == h))

  def numberOfDuplicates (l: List[String]) : List[(String, Int)] =
    l match
      case Nil => Nil
      case (h::t) => (h, l.count(n => n ==h)) :: numberOfDuplicates(l.filterNot(n => n==h))

  def keepUnique [T](l: List[T]) : List[T] =
    l match
      case Nil => Nil
      case (h::t) => if (l.count(n => n == h) <= 1) List(h) ::: keepUnique(l.filterNot(n => n == h))
                     else keepUnique(l.filterNot(n => n == h))

  def keepUniqueTR [T] (xs:List[T]): List[T] =
    @tailrec
    def aux[T](xs:List[T], acc: List[T]) : List[T] =
      xs match
          case Nil => acc
          case h::t => if (xs.count(x=> x==h)>1) aux(xs.filterNot(s=> s==h), List())
                       else aux(t, acc ::: List(h))
    aux(xs, List())