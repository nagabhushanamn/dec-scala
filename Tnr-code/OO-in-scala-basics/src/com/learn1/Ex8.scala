package com.learn1

import java.util.Date

// companion class
class Order private (val inp: String) {
  val date: Date = new Date();
}

// companion object
object Order {
  def getOrder(inp: String) = {
    val order = new Order(inp);
    //order.date = new Date()
    order
  }
}

object Ex8 {
  def main(args: Array[String]): Unit = {

    //    var newOrder = new Order("input")

    var order1 = Order.getOrder("input");
    var order2 = Order.getOrder("input2");

    println(order1.inp)
    println(order1.date)

  }
}