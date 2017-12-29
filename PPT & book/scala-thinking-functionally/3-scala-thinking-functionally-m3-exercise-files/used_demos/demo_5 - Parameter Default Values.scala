
val radius = 10.0

def getCircleStats(r:Double,PI:Double = 3.14) = {
  def getCircleArea(r:Double) = PI * r * r
  def getCircleCircumference(r:Double) = 2 * PI * r
  (getCircleArea(r),getCircleCircumference(r))
}

getCircleStats(10)
getCircleStats(10,3.14)

def getCircleStats(PI:Double = 3.14,r:Double) = {
  def getCircleArea(r:Double) = PI * r * r
  def getCircleCircumference(r:Double) = 2 * PI * r
  (getCircleArea(r),getCircleCircumference(r))
}
getCircleStats(10)
getCircleStats(r=10)





