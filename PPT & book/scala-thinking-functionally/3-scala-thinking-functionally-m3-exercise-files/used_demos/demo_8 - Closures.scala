
def getAreaClosure = {
  val PI = 3.14159
  // line below has issues, type it out
  val getArea = (radius:Double) => {
    PI * radius * radius
  }:Double 
  getArea
}

val PI = 3.1
val areaCalculator:(Double)=>Double = getAreaClosure
val r = 10
println(areaCalculator(r))