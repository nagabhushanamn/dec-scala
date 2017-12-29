package com.learn1

object Ex3 {

  //val message = "Test";

  object message1 {
    def message = " from message1 object";
    def greetMessage = " from message1 object greet";
  }

  object message2 {
    def message = " from message2 object";
  }

  def display() {
    import message1._;
    import message2.message;
    //val message = "Local";
    println(message)
  }

  def main(args: Array[String]): Unit = {
    display();
  }

}