//
object greetLib {
  def sayName(message: String,from :String) = {
    println(s"$message - $from")
  }
}

object tnr {
  def doTeach() = {
    println("teaching - start");
    val notes = "scala-notes";
    val doLearn = () => {
      println(s"learning with $notes");
    }
    println("teaching - end");
    doLearn;
  }
}

object Main {
  def main(args: Array[String]) {

    //    greetLib.sayName("bla bla", "world");

    //    val greet1:(String,String)=>Unit = greetLib.sayName;
    //    val greet2=greetLib.sayName _
    //
    //    greet1("im...","chennai");
    //    greet2("me...","India");
    
    //--------------------------------------
    
    val doLearn:()=>Unit=tnr.doTeach();
    doLearn();
    doLearn();
    

  }
}