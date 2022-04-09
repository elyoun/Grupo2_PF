import scala.annotation.tailrec

List(List("a","a","b","a").takeWhile(x=> x == "a") , List("a","a","b","a").dropWhile(x=> x == "a"))

def groupInList2[T](xs: List[T]): List[List[T]] =
  xs match
    case Nil => Nil
    case h :: t =>
      val (hs, ts) = t.span(s => s == h)
      (h :: hs) :: groupInList2(ts)

groupInList2(List("a", "b", "b", "abba", "abba", "abba", "a", "a"))

def keepUniqueTR [T] (xs:List[T]): List[T] =
  @tailrec
  def aux[T](xs:List[T], acc: List[T]) : List[T] =
    xs match
        case Nil => acc
        case h::t => if (xs.count(x=> x==h)>1) aux(xs.filterNot(s=> s==h), List())
                     else aux(t, acc ::: List(h))
  aux(xs, List())