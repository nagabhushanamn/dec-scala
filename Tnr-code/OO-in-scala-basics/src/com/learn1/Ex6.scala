package com.learn1

/*
 *  visiblity    				  Accessor   Mutator
 *  
 *  var            				 Yes       Yes
 *  val           					 Yes       No
 *  
 *  default visibility       No        No
 *  private with var or val  No        No
 *  
 *  
 * 
 * 
 */

class Person4(private val name: String, private var age: Int) {
  def changeAge(newAge: Int) {
    this.age = newAge;
  }
  def sayName() {
    println(s"im $name")
  }
  def sayAge() {
    println(s"im $age")
  }
}

object Ex6 {
  def main(args: Array[String]): Unit = {

    val p = new Person4("Nag", 33)
    p.sayName();
    p.changeAge(34);
    p.sayAge();

  }
}