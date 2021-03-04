package com.deepak.scala.function

object Functions {
  @transient lazy val logger = Logger.getLogger(this.getClass)

  // Anonymous Function
  val comparingStringLiteral = (a: String, b: String) => {
    if (a == b) 0
    else if (a > b) 1
    else -1
  }: Int

  // Function can return a function
  def comparator (reverse: Boolean): (String, String) => Int = {
    if (reverse) comparingStringDescending
    else comparingString
  }

  // Comparing a string in Descending Order
  def comparingStringDescending (a: String, b: String): Int = {
    if (a == b) 0
    else if (a > b) 1
    else -1
  }

  // Comparing a string
  def comparingString (a: String, b: String): Int = {
    if (a == b) 0
    else if (a > b) -1
    else 1
  }

  // Function can be also used inside a function
  def functionAsArguments (a: String, b: String, comparingString: (String, String) => Int): Int = {
    comparingString(a, b)
  }
}
