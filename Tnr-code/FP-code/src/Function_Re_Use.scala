

object ob1 {
  def m(a: Int, b: Int): Unit = {
    println(a)
    println(b)
  }
}


object ob2{
  def m[E](inp:E)={
    val valueType = inp.getClass 
    println(s"$inp,  is of type $valueType")
  }
}

object Function_Re_Use {
  def main(args: Array[String]): Unit = {
    ob1.m(b=20,a=10)
    ob2.m("hello");
    ob2.m(123);
  }
}