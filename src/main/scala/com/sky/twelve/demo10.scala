package com.sky.twelve

object demo10 {
  def f1(n:Int):Int= {
    if(n==1)
      1
    else
      n*f1(n-1)
  }

  def main(args: Array[String]): Unit = {

    println(f1(5))

  }
}
