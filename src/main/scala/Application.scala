object Application {

def calculateBonus(wage: Int, bonus: Boolean): String = {
  if (bonus == true) s"£${(wage * 1.2).toInt}"

  else s"£$wage"

}

  def main(args : Array[String]) : Unit = {
    println(calculateBonus(100, true))  // should print £120
    println(calculateBonus(100, false)) // should print £100
    println(calculateBonus(99, true))   // should print £118
  }
}