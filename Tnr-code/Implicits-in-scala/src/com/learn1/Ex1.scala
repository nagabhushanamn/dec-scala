

package com.learn1

// Implicits

object Ex1 {

  def main(args: Array[String]): Unit = {

    //    def findAnInt(x: Int) = x;
    //
    //    val n = 100;
    //    val r1 = findAnInt(n); // Explicit Parameter
    //    println(r1);

    //-----------------------------------------

    //    def findAnInt(implicit x: Int) = x;
    //
    //    implicit val n1 = 200;
    //    val r1 = findAnInt // implicit Parameter
    //    println(r1);

    //-----------------------------------------

    //    def findAnInt(implicit x: Int) = x;
    //    def findAnNum(implicit x: Int) = x;
    //
    //    implicit val test = 12;
    //
    //    var r1 = findAnInt; // using scala implicit-lookup mechanism
    //    var r2 = findAnNum;
    //
    //    println(r1)
    //    println(r2)

    //----------------------------------------

    val str: String = "HAL";
    println(str.toLowerCase())
    println(str.length())

    implicit class StringImprovements(s: String) {
      def increment(): String = s.map(c => (c + 1).toChar)
    }

    println(str.increment())
    
    //--------------------------------------------

  }

}