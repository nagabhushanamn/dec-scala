package com.learn1

class Person3(name: String, age: Int) {
  def sayName() {
    println(s"im $name")
  }
  def sayAge() {
    println(s"im $age")
  }
}

object Ex5 {
  def main(args: Array[String]): Unit = {

    val p = new Person3("Nag", 33)
    p.sayName();
    p.sayAge();

  }
}