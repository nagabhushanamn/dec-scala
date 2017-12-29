package com.learn1

import java.util.Date

class A(val x: Int)
class B(val x: Int = 10)
class C(val x: Int = 10, val y: Int)

class Foo {

  lazy val text = {
    var lines = "";
    try {
      lines = "bla bla bla bla" // i.e from file
    } catch {
      case t: Throwable => t.printStackTrace() // TODO: handle error
    }
    println("text block evaluated....")
    lines
  }

  //println(text)

}

object Ex9 {
  def main(args: Array[String]): Unit = {

    val a = new A(10)
    val b = new B(20)
    val c = new C(y = 20);

    var foo = new Foo
        println(foo.text)
        println(foo.text)

  }
}