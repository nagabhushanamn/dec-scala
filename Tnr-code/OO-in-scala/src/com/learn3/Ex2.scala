package com.learn3

import java.util.Date

trait Visitor {
  // abstract methods
  def id: String
  def createdAt: Date
  // concrete methods and fields
  def age: Long = {
    new Date().getTime - createdAt.getTime
  }
}
case class User(
  val id:    String,
  email:     String,
  createdAt: Date   = new Date()) extends Visitor

object Ex2 {

}