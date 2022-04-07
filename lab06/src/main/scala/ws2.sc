List(List("a","a","b","a").takeWhile(x=> x == "a") , List("a","a","b","a").dropWhile(x=> x == "a"))

def groupInList2[T](xs: List[T]): List[List[T]] =
  xs match
    case Nil => Nil
    case h :: t =>
      val (hs, ts) = t.span(s => s == h)
      (h :: hs) :: groupInList2(ts)

groupInList2(List("a", "b", "b", "abba", "abba", "abba", "a", "a"))
