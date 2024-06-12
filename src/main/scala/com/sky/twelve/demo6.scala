package com.sky.twelve

object demo6 {
  def add(a:Int,b:Int)=a+b
  def sub(a:Int,b:Int)=a-b
  def mul(a:Int,b:Int)=a*b
  def div(a:Int,b:Int)=a/b

  def caculate(a:Int,b:Int)(f1:(Int,Int)=>Int)=f1(a,b)

  def main(args: Array[String]): Unit = {

    println(add(1, 9))
    println(sub(1, 9))
    println(mul(1, 9))
    println(div(1, 9))

    println(caculate(1, 9)(_ + _))
    println(caculate(1, 9)(_ - _))
    println(caculate(1, 9)(_ * _))
    println(caculate(1, 9)(_ / _))


  }
}
