package com.sky.thirteen

object demo3 {

//  def getmiddle(a:Array[Int])=a(a.size/2)
  def getmiddle[T](a:Array[T])=a(a.size/2)

  def main(args: Array[String]): Unit = {


    println(getmiddle(Array(1, 2, 3, 4, 5)))



  }
}
