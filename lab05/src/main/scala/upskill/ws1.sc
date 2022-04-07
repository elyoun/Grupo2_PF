def upme (s: String) =

  def aux(s: String, n: Int, acc: String): String =
    if(n>=s.length) acc
    else if(s.charAt(n) == ' ')
      if(s.charAt(n+1) != ' ')
        aux(s, n+1, acc + s.charAt(n+1).toString.toUpperCase())
      else aux(s, n+1, acc + s.charAt(n))
    else aux(s, n+1, acc + s.charAt(n))

  aux(s, 0, "")

upme("prog func ola")