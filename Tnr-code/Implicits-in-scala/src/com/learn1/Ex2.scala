package com.learn1

/*
 *

 lookup mechanism


  -> local scope
  -> parent scope ( missing )
  -> explicit imports
  -> wildcard imports
  -> external scala-file with same package dec
  -> companion types
  -> Nested objects
  -> package objects

 *
 */

object Ex2 {

  object Explicit {
    def x = "Explicit import x";
  }
  object WildCard {
    def x = "WildCard import x";
  }

  //  def testExplicitImport() {
  //    import Explicit.x
  //    println(x);
  //  }
  //  def testWildCardImport() {
  //    import WildCard._
  //    println(x);
  //  }
  def testInlineDefinition() {
    {
      //def x = "Parent x";
      {
        //def x = "Local x";
        //import Explicit.x
        //import WildCard._
        println(x);
      }
    }
  }

  def main(args: Array[String]): Unit = {
    //testExplicitImport();
    //testWildCardImport();
    testInlineDefinition();
  }

}