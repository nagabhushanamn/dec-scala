package com.learn2
//
//class Adder {
//  def add(x: Int, y: Int): Int = {
//    x + y
//  }
//  def apply(x: Int, y: Int): Int = {
//    x + y
//  }
//}
//
//class Util {
//  def apply() = {
//    println("No Arg apply()")
//  }
//  def apply(arg: Int) = {
//    println("One Arg apply()")
//  }
//}

class Employee private (id: Int, name: String, address: String)
object Employee {
  //  def createEmployeeWithId(id: Int) = {
  //    new Employee(id, "Nil", "Nil");
  //  }
  //  def createEmployeeWithIdAndName(id: Int, name: String) = {
  //    new Employee(id, name, "Nil");
  //  }
  //  def createEmployeeWithIdAndNameAndAddress(id: Int, name: String, address: String) = {
  //    new Employee(id, name, address);
  //  }

  def apply(id: Int) = {
    new Employee(id, "Nil", "Nil");
  }
  def apply(id: Int, name: String) = {
    new Employee(id, name, "Nil");
  }
  def apply(id: Int, name: String, address: String) = {
    new Employee(id, name, address);
  }

}

object Ex1 {

  def main(args: Array[String]): Unit = {

    //var adder = new Adder();
    // println(adder.add(12, 12)) // on obj, we r invoking function
    // println(adder(12, 12)); // obj as function

    // val util = new Util
    // util.apply();
    // util();
    // util(12)

    //    val e1 = Employee.createEmployeeWithId(123);
    //    val e2 = Employee.createEmployeeWithIdAndName(123, "A");

    var e1 = Employee(123);
    var e2 = Employee(123, "A");

    //------------------------------------------------------

  }

}