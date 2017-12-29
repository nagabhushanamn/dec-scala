package com.learn2

trait Cloneable {
  def clone1
}
trait Closable {
  def close
}

class O extends Cloneable with Closable {
  def clone1 = println("cloning..")
  def close = println("closing..")
}

trait User {
  def username: String
}

trait Tweeter {
  this: User => // reassign this
  def tweet(tweetText: String) = println(s"$username: $tweetText")
}

class VerifiedTweeter(val username_ :String) extends Tweeter with User { // We mixin User because Tweeter required it
  def username = s"real $username_"
}

object Ex {

  def main(args: Array[String]): Unit = {

    def cloneAndClose(obj: Cloneable with Closable) {
      //
      obj.clone1
      obj.close
    }

    cloneAndClose(new O)

    val realBeyoncé = new VerifiedTweeter("Beyoncé")
    realBeyoncé.tweet("Just spilled my glass of lemonade")

  }

}