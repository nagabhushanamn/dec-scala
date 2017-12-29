package com.learn1

object Ex4 {

  def main(args: Array[String]): Unit = {

    def testFoo(implicit foo: Foo) = println(foo);

    testFoo(new Foo) // explicit foo
    testFoo

  }
}