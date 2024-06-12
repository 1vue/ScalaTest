package com.sky.seven

import scala.collection.mutable.ArrayBuffer

object demo3 {


  def main(args: Array[String]): Unit = {
    val arr=ArrayBuffer("java","python","scala")
    println(arr)
    arr+="flume"
    println(arr)
    arr-="java"
    println(arr)
    arr++=Array("c","c++","vue")
    println(arr)
    arr--=Array("python","c")
    println(arr)
    println(arr)
  }
}
