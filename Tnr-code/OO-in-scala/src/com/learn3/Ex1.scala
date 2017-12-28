package com.learn3

//
//object MRFWheel {
//  def rotate() = println("MRF Wheel rotating")
//}

trait Wheel {
  def rotate(): Unit
}
trait Safety {
  def safety(): Unit
}

class BaseWheel {

}

class MRFWheel extends BaseWheel with Wheel with Safety {
  def rotate() = println("MRF-Wheel rotating..")
  def safety() = {}
}

class CEATWheel extends Wheel {
  def rotate() = println("CEAT-Wheel rotating..")
}

//object Car {
//  def move() = println("Car is moving....")
//}

class Car {
  var wheel: Wheel = null;
  def setWheel(wheel: Wheel) {
    this.wheel = wheel;
  }
  def move() = {
    wheel.rotate();
    println("Car is moving....")
  }
}

/*
 * problems with car-module
 * --------------------------
 *
 *  ==> tight-coupled  ( design-issue )
 *  ==> too many dependency instances are created & destructed... ( performance issue )
 *  ==> unit-testing not possible ( devlopement slow & release will be an issue )
 *
 *  soln :
 *
 *   using good S.O.L.I.D principles
 *
 *
 	   S — Single responsibility principle
     O — Open for Extension & closed for Modification principle
     L — Liskov substitution principle
     I — Interface segregation principle
     D — Dependency Inversion principle
 *
 *
 */

/*
 *
 *  traits
 *
 */

object Ex1 {
  def main(args: Array[String]): Unit = {

    var car = new Car;
    car.setWheel(new MRFWheel)
    car.setWheel(new CEATWheel)
    car.move();

  }
}