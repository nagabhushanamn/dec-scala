


object tnr2 {
  
  def doTeach(sub:String) = {
    
    println(s"teaching $sub - start");
    val notes = s"$sub-notes";
    
    val doLearn = () => {
      println(s"learning with $notes");
    }
    
    println(s"teaching $sub - end");
    
    doLearn
    
  }
}

object Closure_Ex {
  
  def main(args: Array[String]): Unit = {
    
    val doLearn=tnr2.doTeach("scala");
    doLearn();
    
    
  }
  
}