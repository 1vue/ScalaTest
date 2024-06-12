package com.sky.thirteen

object demo1 {

  def f1(n:Int):Int={

    if(n==1||n==2)
      1
    else
      f1(n-1)+f1(n-2)


  }


  def main(args: Array[String]): Unit = {

    println(f1(12))



  }
}
