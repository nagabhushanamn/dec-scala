package com.learn1

class Person {

  var name = "Nil"
  var age = 0

  def sayName() {
    println(s"im $name")
  }
  def sayAge() {
    println(s"im $age old")
  }

}



object Ex2 {
  def main(args: Array[String]): Unit = {

    val p1 = new Person

    p1.name = "Nag";
    p1.age = 33;

    println(p1.name)
    println(p1.age)

  }
}