package com.learn2

import com.learn1.Person

/*
 *  when to use case classes in scala

 *  ==> to make immutable instances
 *  ==> can be used with pattern-matching cases
 *  ==> much boiler-plate methods from compiler ( i.e hashcode ,equals ,... )
 *
 *
 *  imp-note : for every case class, we also get one companion-object with apply methods
 *
 */

case class NewProduct(id: Int, name: String, price: Double) {
}

object Ex3 {
  def main(args: Array[String]): Unit = {

    //    val p1 = new NewProduct(123, "Mobile", 1000.00);
    //    val p2 = new NewProduct(123, "Mobile", 1000.00);
    //
    //    println(p1 == p2)
    //    var p3 = p1.copy(price = 2000.00);

    //------------------------------------------------

    val p1 = NewProduct(1, "item1", 100.00);
    val p2 = NewProduct(2, "item2", 200.00);

    p1 match {
      case NewProduct(id, name, 100) => println("low price product")
      case _                         => println("high price product")
    }

  }
}