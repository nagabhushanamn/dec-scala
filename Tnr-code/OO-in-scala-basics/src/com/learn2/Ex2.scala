package com.learn2

class Product private (val id: Int, val name: String, val price: Double)

object Product {
  def apply(id: Int, name: String, price: Double) {
    // validation & conversion.. //
    new Product(id, name, price);
  }
}

object Ex2 {

  def main(args: Array[String]): Unit = {

    //var product1 = new Product(2313, "Laptop", 0.0) // OO style
    var product2 = Product(2312, "Laptop", 0.0) // FP style

    //----------------------------------------------

    //    var menu = Array("meals", "biryani");
    //
    //    //    println(menu.apply(0))
    //    println(menu(0))
    ////    println(menu.apply(1))
    //    println(menu(1))

    //--------------------------------------------

    //    val f = (i: Int) => { "something" }
    //
    //    object o {
    //      val data = "something"
    //      def apply(i: Int) = {
    //        data
    //      }
    //    }
    //
    //    print(f(100))
    //    print(o(100))

    //---------------------------------------------

  }

}