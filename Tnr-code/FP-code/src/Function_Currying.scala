

object ob3 {

  def smartCompare(s1: String, s2: String, cmpFn: (String, String) => Int) = {
    cmpFn(s1, s2);
  }

  def curryCompare(cmpFn: (String, String) => Int)(s1: String, s2: String) = {
    cmpFn(s1, s2);
  }
}

object Function_Currying {
  def main(args: Array[String]): Unit = {

    def compareStrings(s1: String, s2: String): Int = {
      if (s1 == s2) 0
      else if (s1 > s2) -1
      else { 1 }
    }
    
    val compare=ob3.curryCompare(compareStrings)(_,_);
    
    println(compare("hello","hello"));

  }
}