
val PI = 3.14
val r = 10

def getCircleArea(r:Double):Double = PI * r * r

// won't work
val calcCircleArea = getCircleArea

val calcCircleArea: (Double) => Double = getCircleArea
calcCircleArea(r)

val calcCircleArea = getCircleArea _
calcCircleArea(r)

def getPI() = {PI}
getPI

val calcPI: () => Double = getPI
calcPI()
val calcPI = getPI _
calcPI()

def getAreaClosure = {
  val PI = 3.14159
  // line below has issues, type it out
  val getArea = (radius:Double) => {
    PI * radius * radius
  }:Double
  getArea
}

val PI = 3.1
val r = 10

val areaCalculator:(Double)=>Double = getAreaClosure
println(areaCalculator(r))

val areaCalculator = getAreaClosure _
println(areaCalculator(r))



