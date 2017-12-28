package com.learn

/*
 *
 *   Functional Programming - principles
 *   --------------------------------------
 *   
 *   ==> function(s) as value/object to variales
 *   ==> function as argument to other function
 *   ==> function as return value from other function
 *   ==> partial functions support
 *   ==> currying
 *   ==> closure support
 *
 *
 */

object GreetLib {
  def greet(f: () => Unit) = f()
}

object FP_Learn {

  def main(args: Array[String]): Unit = {

    val list = List.range(1, 10);

    //------------------------------------------
    // Anonymous Function
    //------------------------------------------

    //    list.foreach((n:Int)=>println(n))
    //    list.foreach((n) => println(n))
    //    list.foreach(n => println(n))
    //    list.foreach(println(_))
    //    list.foreach(println)

    //    val evens1 = list.filter((i:Int)=>i%2==0)
    //    val evens1 = list.filter { i => i % 2 == 0 }
    //    val evens1 = list.filter { _ % 2 == 0 }
    //    val evens1 = list.filter(_ % 2 == 0)

    //    GreetLib.greet(() => println("Hello.."))
    //    GreetLib.greet { () => println("Ola..") }

    //------------------------------------------
    // How to use function as variables ( values )
    //------------------------------------------

    //    val doubleFunc = (i: Int) => { i * 2 }: Int
    //    val isEven1 = (i: Int) => { i % 2 == 0 }: Boolean
    //    val isEven2: Int => Boolean = i => { i % 2 == 0 }
    //    val isEven3: Int => Boolean = i => i % 2 == 0
    //    val isEven4: Int => Boolean = _ % 2 == 0

    // implicit approach:

    //    val add1 = (x: Int, y: Int) => { x + y }
    //    val add2 = (x: Int, y: Int) => x + y
    //
    // explicit approach:

    //    val add3: (Int, Int) => Int = (x, y) => { x + y }
    //    val add4: (Int, Int) => Int = (x, y) => x + y
    //
    //    val addThenDouble: (Int, Int) => Int = (x, y) => {
    //      val sum = x + y;
    //      sum * 2
    //    }

    //-------------------------------------------------------

    // -----------------------------------------
    //  Using Method like an anonymous function
    //------------------------------------------

    //    def modMethod1(i: Int) = i % 2 == 0
    //    def modMethod2(i: Int) = { i % 2 == 0 }
    //    def modMethod3(i: Int): Boolean = i % 2 == 0
    //    def modMethod4(i: Int): Boolean = { i % 2 == 0 }
    //
    //    def modFunction = (i: Int) => i % 2 == 0;
    //
    //    val newList1 = list.filter(modMethod1)
    //    val newList2 = list.filter(modFunction)

    //---------------------------------------------------------

    //-----------------------------------------
    // Assign an existing function/method to function variables
    //-----------------------------------------

    // println(scala.math.abs(12.5567))

    //    val abs1:(Double=>Double)=scala.math.abs
    //    val abs2 = scala.math.abs _
    //
    //    val pow1=scala.math.pow(_, _);
    //
    //
    //    def myMethod(x:Int,y:Int){
    //      println(s"$x,$y")
    //    }
    //
    //    val myMethod1=myMethod(_, _);
    //    myMethod1(1,2)
    //
    //    var partialMyMethod1=myMethod(1, _:Int);
    //    partialMyMethod1(2)

    
    //-----------------------------------------
    //  How to define scala methods that accepts a function param
    //-----------------------------------------

    //    def executeFunction(callback: () => Unit) {
    //      callback();
    //    }

    //    val sayHello = () => { println("Hello...") }
    //    executeFunction(sayHello);

    //---------------------------------------------------------
    //
    //    def exec(callback: Int => Unit) {
    //      // invoke the function we were given, giving it an Int parameter
    //      callback(1);
    //    }
    //
    //    val plusOne = (i: Int) => println(i + 1)
    //    val plus100 = (i: Int) => println(i + 100)
    //
    //    exec(plusOne)
    //    exec(plus100)

    //---------------------------------------------------------

    //    def executeFunction(f: (Int, Int) => Boolean) = {
    //      val b = f(12, 12)
    //      b
    //    }
    //
    //    val isEqual = executeFunction((a: Int, b: Int) => a == b);
    //    println(isEqual)

    //---------------------------------------------------------

    //    def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int) = {
    //      var result = f(x, y);
    //      println(result);
    //    }
    //
    //    executeAndPrint((x, y) => x + y, 12, 13);
    //    executeAndPrint((x, y) => x * y, 12, 13);
    //    executeAndPrint((x, y) => x - y, 12, 13);
    //    executeAndPrint((x, y) => x / y, 12, 13);

    //---------------------------------------------------------

    //-----------------------------------------
    //  closure
    //-----------------------------------------

    /*
     *  a function can able to access parent scoped data,
     *  even after parent scope closed
     *
     */
    //-----------------------------------------

    //    def doWork(f: () => Unit) {
    //      f();
    //      println(" and working")
    //    }
    //
    //    def teach() = {
    //      var notes = "scala-notes";
    //      val learnFunc = () => {
    //        println("learning with " + notes)
    //      }
    //      learnFunc
    //    }
    //
    //   val learnFunc= teach();
    //   doWork { learnFunc }

    //-----------------------------------------

    //-----------------------------------------
    //  partial function
    //-----------------------------------------

    //    var add = (a: Int, b: Int, c: Int) => a + b + c;
    //    var partialAdd = add(1, 2, _: Int)
    //    println(partialAdd(3))
    //
    //    def wrap(prefix: String, html: String, suffix: String) = {
    //      prefix + html + suffix;
    //    }
    //
    //    var wrapWithDiv = wrap("<div>", _: String, "</div>");
    //    println(wrapWithDiv("Scala"))

  }

}