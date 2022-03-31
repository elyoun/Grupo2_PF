def and(a: Boolean, b: Boolean): Boolean =
 // if(a==false) false
 //else if(b==false) false else true
 if (a==false) a else b


def or(a: Boolean, b: Boolean): Boolean =
  //if (a==true) true
  //else if (b==true) true else false
  if(a==false) b else a

assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)


println("tests passed")
