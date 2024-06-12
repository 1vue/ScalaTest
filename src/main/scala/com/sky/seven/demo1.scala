package com.sky.seven


//定义数组
object demo1 {
  def main(args: Array[String]): Unit = {

    val arr1= Array[Int](10)
    arr1(0)=11
    println(arr1(0))
    println(arr1.length)
var arr2=Array("java","python","scala")

    println(arr2(2))
    println(arr2.size)
  }
}
