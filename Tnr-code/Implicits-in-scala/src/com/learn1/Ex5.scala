package com.learn1

object Ex5 {
  def main(args: Array[String]): Unit = {

    trait Foo

    object Foo {
      implicit val x = new Foo {
        override def toString() = "Companion Foo"
      }
    }

    //    implicit val x = new Foo {
    //      override def toString() = "Local Foo"
    //    }

    def method(implicit foo: Foo) = println(foo);

    //import Foo.x;
    method
    method

  }
}