def filterEven(l: List[Int]): List[Int] =
  l.filter(_ % 2 ==0)


def filterStart(l: List[String], start: String): List[String] =
  l.filter(_.startsWith(start))

def filterTuple(l: List[(Int, String)], min: Int, s: String): List[String] =
  l.filter(_._1 > min)


filterEven(List(1,2,3,4,5,6))