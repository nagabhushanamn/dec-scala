package com.learn2

abstract class Animal {
  def name: String
}
abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name: String = "Lion"
}

class PetContainer[P <: Pet](p: P) {
  def pet: P = p
}

trait Node[+B] {
  def prepend[U >: B](elem: U): Node[U]
}

case class ListNode[+B](h: B, t: Node[B]) extends Node[B] {
  def prepend[U >: B](elem: U) = ListNode[U](elem, this)
  def head: B = h
  def tail = t
}

case class Nil[+B]() extends Node[B] {
  def prepend[U >: B](elem: U) = ListNode[U](elem, this)
}

trait Bird
case class AfricanSwallow() extends Bird
case class EuropeanSwallow() extends Bird

object Bounds_Ex {

  def main(args: Array[String]): Unit = {

    val dogContainer = new PetContainer[Dog](new Dog)
    val catContainer = new PetContainer[Cat](new Cat)
    //val lionContainer = new PetContainer[Lion](new Lion)

    val africanSwallowList = ListNode[AfricanSwallow](AfricanSwallow(), Nil())
    val birdList: Node[Bird] = africanSwallowList
    birdList.prepend(new EuropeanSwallow);

  }

}