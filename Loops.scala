package com

object Loops {

  def main (args: Array[String]): Unit = {

    val monthsInYear = List("January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December")

    for (x <- 0 until monthsInYear.size){
      println(monthsInYear(x))
    }
    /*
    * January
February
March
April
May
June
July
August
September
October
November
December*/


    for (month <- monthsInYear if month == "July"){
      println(" That's July Mont") //  That's July Mont
    }


    for (month <- monthsInYear) {
      month match {
        case "January" => println("Republic Day Celebrations Month")
        case "February" => println("Valentines week Celebrations Month")
        case "March" => println("Holi Celebrations Month")
        case restOfMOnth => println(restOfMOnth)
      }
    }

    /*
    * Republic Day Celebrations Month
Valentines week Celebrations Month
Holi Celebrations Month
April
May
June
July
August
September
October
November
December
    * */

    val months = for (month <- monthsInYear) yield {
      month match {
        case "January" => println("Subhas Chandra Bose Month")
        case "February" => println("Pulwama Attack , Black Month")
        case "March" => println("Saheed Bhagat Singh Month")
        case restOfMOnth => println(restOfMOnth)
      }
    }
    /*
    * Subhas Chandra Bose Month
Pulwama Attack , Black Month
Saheed Bhagat Singh Month
April
May
June
July
August
September
October
November
December*/

    for ( x <- 0 until 12 ; y <- monthsInYear) {
      println(s" Values are : $x , $y")
    }
    
    /*
    *  Values are : 0 , January
 Values are : 0 , February
 Values are : 0 , March
 Values are : 0 , April
 Values are : 0 , May
 Values are : 0 , June
 Values are : 0 , July
 Values are : 0 , August
 Values are : 0 , September
 Values are : 0 , October
 Values are : 0 , November
 Values are : 0 , December
 Values are : 1 , January
 Values are : 1 , February
 Values are : 1 , March
 Values are : 1 , April
 Values are : 1 , May
 Values are : 1 , June
 Values are : 1 , July
 Values are : 1 , August
 Values are : 1 , September
 Values are : 1 , October
 Values are : 1 , November
 Values are : 1 , December
  .......................
  .......................
 Values are : 11 , September
 Values are : 11 , October
 Values are : 11 , November
 Values are : 11 , December*/

    var i = 0
    while (i < monthsInYear.size){
      println(monthsInYear(i))
      i += 1
    }
    
    /*
    * January
February
March
April
May
June
July
August
September
October
November
December*/
  }
}
