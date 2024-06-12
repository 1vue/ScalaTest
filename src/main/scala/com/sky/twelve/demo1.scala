package com.sky.twelve

object demo1 {

  def add(a:String,b:String)=a+b

  def add2(a:String,b:String)(f1:(String,String)=>String)=f1(a,b)


  def main(args: Array[String]): Unit = {

    val c=add("abc","cnmk")
    println(c)

val d=add2("abc","cnmk")(_+_)
    println(d)
  }




}
