
package com.learn1

class Java
class Scala

class Trainer[T](var subject: T) {
}

class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A) { elements = x :: elements }
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}
object GenericType_Ex {

  def main(args: Array[String]): Unit = {

    //    var javaSub = new Java
    //    var javaTnr = new Trainer[Java](javaSub);
    //
    //    var scalaSub = new Scala
    //    var scalaTnr = new Trainer[Scala](scalaSub)
    //
    //    javaTnr.subject = new Java // type-safety

    //---------------------------------------------------

    val stringStack = new Stack[String]
    stringStack.push("Hello");
    stringStack.push("world");

    val numberStack = new Stack[Int]
    numberStack.push(1)
    numberStack.push(2)

    class Fruit
    class Apple extends Fruit
    class Banana extends Fruit

    val stack = new Stack[Fruit]
    val apple = new Apple
    val banana = new Banana

    stack.push(apple)
    stack.push(banana)

  }

}