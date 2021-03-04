package com

object PatternMatching {

  def main (args: Array[String]): Unit = {

    val name = "Deepak"

    val nameMeaning = name match {
      case "Deepak" => "Name Deepak Means Light"
      case "Singh" => "Name Singh Means Lion   "
    }
    println(nameMeaning)
    // Name Deepak Means Light

    val month = "June"
    val celebrationMonth = month match {
      case "March" => "Holi - Festival of colours"
      case "April" => " Good Friday "
      case _ => {
        val notMatched = s"It's neither Holi nor Good Friday . It's $month"
        month
      }
    }
    println(celebrationMonth)
    // June

  }
}
