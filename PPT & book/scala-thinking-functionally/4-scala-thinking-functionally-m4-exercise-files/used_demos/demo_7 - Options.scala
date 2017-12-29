
def fraction(numer:Double,denom:Double): Option[Double] = {
if (denom == 0) 
  None 
else 
  Option(numer/denom)
}

fraction(22,7)

fraction(22,0)

val pi = fraction(22,7) getOrElse "Oops, something went wrong"

val pi = fraction(22,0) getOrElse "Oops, something went wrong"


fraction(22,7) match
{
  case Some(pi) => pi
  case None => "Something bad happened"
}

fraction(22,0) match
{
  case Some(pi) => pi
  case None => "Something bad happened"
}