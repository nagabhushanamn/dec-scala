

case class Person(name: String, age: Int)

object Ex {
  def main(args: Array[String]): Unit = {

    val people = List(
      Person("Nag", 33),
      Person("Ria", 1))

      val (minors, adults) = people partition (_.age < 18)
    
    
  }
}