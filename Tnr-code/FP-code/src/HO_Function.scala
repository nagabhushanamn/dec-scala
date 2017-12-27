

object Greet {

  // Higher Order..
  def greet(f: () => Unit) {
    f();
  }
}

object Trainer {
  // Higher Order..
  def doTeach(sub: String)= {
    println(s"teaching $sub")
    val doLearn =() => {
      println(s"learning $sub")
    }
    doLearn
  }
}

object HO_Function {

  def main(args: Array[String]): Unit = {

    val en = () => { println("Hello...") }
    val es = () => { println("Ola...") }

//    Greet.greet(en);
//    Greet.greet(es);
    
    val doLearn=Trainer.doTeach("scala");
    doLearn();
    doLearn();
    
  }

}