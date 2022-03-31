//def incDigits(s: String,i: Int) = s.map(c => if (c.isDigit) (c+i).toChar else c)

tap.StringFunctions.incDigits("ola2", 4)
tap.StringFunctions.incDigits("123", 1)
tap.StringFunctions.incDigits("asd", 3)
tap.StringFunctions.removeDigits("123")