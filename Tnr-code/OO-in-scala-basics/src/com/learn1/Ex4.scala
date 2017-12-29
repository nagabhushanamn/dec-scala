package com.learn1

class Person2(val name: String, val age: Int) {

}

object Ex4 {
  def main(args: Array[String]): Unit = {

    val p = new Person2("Nag", 33)
    println(p.name)

  }
}