class ExercisesFilter:
  // TODO: Use the filter function of List to transform list l into a list of only even numbers
  def filterEven(l: List[Int]): List[Int] =
    l.filter(_ % 2 ==0)
  // TODO: Use the filter function of List to transform list l into a list of only string starting with "start"
  def filterStart(l: List[String], start: String): List[String] =
    l.filter(_.startsWith(start))

  // TODO: Use the filter function of List to transform list l into a list of only string with size smaller than "size"
  def filterSize(l: List[String], size: Int): List[String] =
    l.filter(_.size < size)
  
  // TODO: Use the filter function of List to transform list l into a list of only Tuples which thi int part in greater than "min" and the string patr contains "s"
  def filterTuple(l: List[(Int, String)], min: Int, s: String): List[String] =
    l.filter((i,str) =>
