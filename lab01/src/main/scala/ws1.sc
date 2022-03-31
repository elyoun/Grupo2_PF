
def and(x: Boolean, y: Boolean): Boolean =
  if (x==true) y  else false


def or (x: Boolean, y: Boolean): Boolean =
  if (x==true) true else y



assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)

println("tests passed")

