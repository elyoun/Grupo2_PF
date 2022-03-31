package tap

object StringFunctions:

  def removeDigits(s: String): String = s.filter(c => !c.isDigit)

  def incDigits(s: String, i: Int) = s.map(c => if (c.isDigit) (c+i).toChar else c)





