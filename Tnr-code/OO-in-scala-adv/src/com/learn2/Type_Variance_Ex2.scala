
package com.learn2

/*
 *  Drink
 *
 *     - SoftDrink
 *     		- Cola
 *         - TonicWater
 *     - Juice
 *     		- Orange
 *         - Apple
 *
 *
 */

class Drink
class SoftDrink extends Drink
class Juice extends Drink

class Cola extends SoftDrink
class TonicWater extends SoftDrink

class OrangeJuice extends Juice
class AppleJuice extends Juice

class VendingMachine[+A] {
  //
}

object Type_Variance_Ex2 {

  def main(args: Array[String]): Unit = {

    def install(softDrinkVM: VendingMachine[SoftDrink]): Unit = {
      //..
    }

    // covariant subtyping
    install(new VendingMachine[Cola])
    install(new VendingMachine[TonicWater])

    // invariant
    install(new VendingMachine[SoftDrink])

    // Contravariant
    //install(new VendingMachine[Drink])

  }

}