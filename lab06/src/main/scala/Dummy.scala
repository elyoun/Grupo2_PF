import scala.annotation.tailrec

object Dummy:
  def stringToInt(s: String): Int = s.toInt

  def squareNCounts(count: Int) =
    List.tabulate(count)(n => List.fill(count)(n*n))

  def lengthElements(x: List[String])=
    x.map(s => s.length)

  def findSubstrings(x: List[String], str: String)=
    x.filter(s => s.contains(str))


  def findSubstringsRec(x: List[String], str: String) : List[String]=

    def startsWith(h: String, str: String): Boolean =

      def startsWithAux(s1: String, s2: String, n: Int): Boolean =

        if (n >= s2.size) true
        else if (s1.charAt(n) != s2.charAt(n)) false
        else startsWithAux(s1,s2,n+1)

      if(h.size < str.size) false
      else startsWithAux(h, str, 0) || startsWith(h.tail,str)

    x match
      case Nil => Nil
      case (h::t) => if (startsWith(h, str)) h :: findSubstringsRec(t, str) else findSubstringsRec(t, str)




  def doubleList(xs: List[Int]): List[Int]=
    xs match
      case Nil=> Nil
      case h::t => h*2 :: doubleList(t)

  def doubleListTR(xs: List[Int]): List[Int]=
    @tailrec
    def aux(xs: List[Int], acc: List[Int]) : List[Int] =
      xs match
        case Nil=> acc.reverse
        case h::t => aux(t, h*2 :: acc)

    aux(xs, List())

  def doubleListAlt(xs: List[Int]): List[Int] =
    xs.map(_*2)


  def constructList(xs: List[(String, Int)]):List[String]=xs match
    case Nil => Nil
    case (x,y):: xs1=> List.fill(y)(x) ::: constructList(xs1)

  def constructListTR (xs: List[(String, Int)])  :List[String]=
    @tailrec
    def aux (xs: List[(String, Int)], acc: List[String]) : List[String] =
      xs match
        case Nil => acc.reverse
        case (x,y) :: t => aux(t, List.fill(y)(x) ::: acc)

    aux(xs, Nil )

  def duplicateDigits(xs: List[Int]): List[Long]=
    xs match
      case Nil => Nil
      case x::ys => (x.toString + x.toString).toLong :: duplicateDigits(ys)

  def duplicateDigitsTR(xs: List[Int]): List[Long]=
    @tailrec
    def aux (xs: List[Int], acc: List[Long]) : List[Long] =
      xs match
        case Nil => acc.reverse
        case h::t => aux(t, (h.toString + h.toString).toLong :: acc)

    aux(xs, Nil)

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


  def groupInListTR[T](xs: List[T]): List[List[T]]=
    @tailrec
    def aux [T] (xs: List[T], acc: List[List[T]]): List[List[T]] =
      xs match
        case Nil => acc.reverse
        case h::t =>
          val (x,y) = xs.span(_ == h)
          aux(y, x :: acc)

    aux(xs, Nil)
  
  
  def sumCubes (x: Int, y: Int) =
    List.range(x, y+1).map(s => s*s*s).reduceLeft(_+_)

  def unConstructList(l : List[String]) : List[(String, Int)]=
    l match
      case Nil => Nil
      case (h::t) => List((h, l.takeWhile(x => x == h ).size)) ::: unConstructList((h::t).dropWhile(x => x == h))

  def unConstructListTR(l : List[String]) : List[(String, Int)]=
    @tailrec
    def aux (l: List[String], acc: List[(String, Int)]) : List[(String, Int)] =

      l match
        case Nil => acc
        case (h::t) =>
          val (x,y) = l.span(_ == h)
          aux(y, (h, x.size) :: acc)

    aux (l, List())


  def numberOfDuplicates (l: List[String]) : List[(String, Int)] =
    l match
      case Nil => Nil
      case (h::t) => (h, l.count(n => n ==h)) :: numberOfDuplicates(l.filterNot(n => n==h))

  def numberOfDuplicatesTR (l: List[String]) : List[(String, Int)] =
    @tailrec
    def aux(l: List[String], acc: List[(String, Int)]) : List[(String, Int)] =

      l match
        case Nil =>  acc.reverse
        case (h::t) => aux(l.filterNot(_ == h), (h,l.filter(_ == h).size) :: acc)

    aux(l, List())

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