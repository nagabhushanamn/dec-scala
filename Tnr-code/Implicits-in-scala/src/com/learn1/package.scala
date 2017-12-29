package com

package object learn1 {
  implicit def foo = new Foo
  implicit val x="im from package object"
}