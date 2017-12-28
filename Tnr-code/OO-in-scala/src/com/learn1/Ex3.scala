package com.learn1

class Person1(var name: String) {

  var age = 0;
  private var priField = "PRIVATE";

  override def toString = s"Name : $name, Age: $age , with $priField"

  def sayNameAndAge() {
    println(this)
  }

  sayNameAndAge()

}

object Ex3 {
  def main(args: Array[String]): Unit = {

    val p = new Person1("Nag")

  }
}