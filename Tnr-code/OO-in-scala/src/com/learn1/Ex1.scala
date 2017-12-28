package com.learn1

object p1 {
  val name = "Nag"
  val age = 33;
  def sayName() {
    println(s"im $name")
  }
}

object p2 {
  val name = "Ria"
  val age = 2;
  def sayName() {
    println(s"im $name")
  }
}

object Ex1 {

  def main(args: Array[String]): Unit = {

    println(p1.name)
    println(p1.age)

    //    p1.sayName()
    p1.sayName
    
    p2.sayName()

  }

}