package com.scalapractise

/**
  * Chapter 2 - Control Structures & Functions
  * Exercises
  */

object chapter2 extends App{

  //1.signum function
  def signum1(x:Int) = x match {
    case 0 => 0
    case _ if (x>0) => 1
    case _ => -1
  }

  //4.Scala equivalent of following java code: for (int i = 10; i >= 0; i--) System.out.println(i);
  //def forloop = {
  for (i <- 0 to 10 by -1) println(i)
  //}

  //5.Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  def proc(x:Int) = {
    for (i<- x to 0 by -1) println(i)
  }

  println(signum1(90))
  //println(forloop)
  println(proc(10))

}
