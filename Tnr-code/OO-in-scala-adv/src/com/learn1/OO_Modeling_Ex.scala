

/*
 *  Modeling Data with Traits
 *  -------------------------
 *
 *
 *  OO programming
 *  -----------------
 *  ==> logical ORs and ANDs
 *  ==> IS-A  , HAS-A
 *
 *  FP programming
 *  ---------------
 *
 *  ==> PRODUCT Type
 *  ==> SUM type
 *
 *  --------------------------------------------------
 *
 *  a. Product-Type pattern | has-a + AND
 *
 *  if A has a b(with Type B) and a c( with Type C) write
 *
 *  ==> case class A(b:B,c:C)
 *
 *  or
 *
 *  ==> trait A{
 *  				def b:B
 *         def c:C
 *  			}
 *
 *  --------------------------------------------------
 *
 *  b. SUM Type pattern  | is-a + OR
 *
 *  if A is a B or C
 *
 *  trait A
 *  case class B() extends A
 *  case class C() extends A
 *
 *  ---------------------------------------------------
 *
 *   Algebraic Data Types
 *   ---------------------
 *
 *               AND            OR
 *
 *    is-a       ?              SUM-type
 *    has-a    PRODUCT-type       ?
 *
 *  ------------------------------------------------------
 *
 *  is-a + AND  pattern
 *  --------------------
 *
 *  e.g
 *
 *  trait B
 *  trait C
 *  trait A extends B with C
 *
 *
 *  has-a + OR pattern
 *  ------------------
 *
 *  trait A{
 *  		def d:D
 *  }
 *
 *  trait D
 *  case class B extends D
 *  case class C extends D
 *
 *
 *  ---------------------------------------------------------------------
 *
 *
 */

// IS-A + AND
//
//trait Wheel1
//trait TransportRules
//
//case class MRFWheel1() extends Wheel1 with TransportRules

//--------------------------------------------------------------

// IS-A + OR

//trait Wheel1
//trait MRFWheel1 extends Wheel1
//trait CEATWheel1 extends Wheel1

//-------------------------------------------------------------------------

// HAS-A + AND
//
//trait Keyboard
//trait Mouse
//case class Laptop(kb:Keyboard,mouse:Mouse)

//----------------------------------------------------------------------------------

// HAS-A + OR
//
//trait Mobile
//trait Samsung extends Mobile
//trait Apple extends Mobile
//
//case class Person(mobile:Mobile)

//------------------------------------------------------------------------------------

package com.learn1

object OO_Modeling_Ex {
  def main(args: Array[String]): Unit = {

    trait A {
      def foo: String
    }
    case class B() extends A {
      def foo: String = "Its B!"
    }
    case class C() extends A {
      def foo: String = "Its C!"
    }

    var anA:A = B();
    println(anA.foo)

    anA = C();
    println(anA.foo)
    
  }
}