

package com.learn1

object Company {
  val name = "cts";
  def work() = {
    println("working...")
  }
}
//-------------------------------------------

class Employee(id: Int, name: String) {
  def doListen() = {
    //...
  }
  def doWork() = {
    //..
  }
}
//-------------------------------------------

// Inheritance

abstract class LivingThing() {
  println("LivingThing - constructor")
  val name: String = ""
  def eat = println("LT Eat...")
  def sleep = println("LT Sleep...")
  def work // abstract
}

class Human extends LivingThing {
  println("Human - constructor")
  def study = println("Human Study")
  override def work = println("Human work..")
}

class Animal extends LivingThing {
  override def work = println("Animal work..")
}

class Robot extends LivingThing {
  override def eat = println("Robot Eat...")
  override def work = println("Robot Work...")
}

// OO principal : Open for extension, closed for modification
class God {

  //  def manageHuman(human: Human) {
  //    human.eat
  //    human.sleep
  //    human.study
  //    human.work
  //  }
  //  def manageAnimal(animal: Animal) {
  //    animal.eat
  //    animal.sleep
  //    animal.work
  //  }

  def manageLT(livingThing: LivingThing) = {
    livingThing.eat
    livingThing.sleep
    livingThing.work
  }

}

//-------------------------------------------

trait Wheel {
  val radius = 10;
  def rotate: Unit // abstratct
  def m = println("defined method in wheel trait") // normal
}

class MRFWheel extends Wheel {
  def rotate(): Unit = println("MRFWheel rotating...")
}
class CEATWheel extends Wheel {
  def rotate(): Unit = println("MRFWheel rotating...")
}

class Car {
  def move(wheel: Wheel) {
    wheel.rotate;
    println("Car moving....")
  }
}

//-------------------------------------------

abstract class A1
abstract class A3
trait T1
trait T2
trait T3

class C1 extends A1
class C2 extends T1 with T2 with T3 // Mixin pattern

class C3 extends A1 with T1 with T2

//--------------------------------------------

trait Cookies
trait Fruits
trait Choc
abstract class Base
class IceCream extends Base with Choc with Cookies with Fruits

//---------------------------------------------

object OO_In_Scala {

  def main(args: Array[String]): Unit = {

    //--------------------------------
    //    var v = 12;
    //    val vv = 13;
    //    lazy val vvv = 14;
    //
    //    var func = () => {
    //      //..
    //    };
    //    def method() = {
    //      //..
    //    }
    //--------------------------------
    //  println(Company.name)
    //  Company.work()
    //--------------------------------
    //    val e1 = new Employee(1, "A");
    //    val e2 = new Employee(2, "B");
    //-------------------------------

    val god: God = new God

    //val livingThing = new LivingThing
    val human = new Human
    //val animal = new Animal
    //val robot = new Robot

    //god.manageHuman(human)
    //god manageHuman human
    //god manageLT human
    println()
    //god manageAnimal animal
    //god.manageLT(animal)
    println()
    //god.manageLT(robot)

    //----------------------------------

    //    val car=new Car();
    //    car.move(new MRFWheel)
    //
    //----------------------------------

    // val ice=new IceCream

    //-----------------------------------

  }

}