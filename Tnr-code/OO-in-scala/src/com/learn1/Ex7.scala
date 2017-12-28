package com.learn1

class Pizza(var crustsize: Int, crustType: String) {

  def this(crustSize: Int) {
    this(crustSize, "THIN");
  }
  def this(crustType: String) {
    this(12, crustType);
  }
  def this() {
    this(12);
  }

}

object Ex7 {
  def main(args: Array[String]): Unit = {

    var pizza0 = new Pizza();
    var pizza1 = new Pizza(12);
    var pizza2 = new Pizza(12, "THIN");

  }
}