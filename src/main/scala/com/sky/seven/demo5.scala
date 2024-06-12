package com.sky.seven

object demo5 {
  def main(args: Array[String]): Unit = {


    val arr=Array(2,5,3,1,4,8)

    println(s"sum:${arr.sum}")
    println(s"max:${arr.max}")
    println(s"min:${arr.min}")

    val arr2=arr.sorted

    

   for(i<-arr2) println(i)

    val arr3=arr.reverse

    for(i<-arr3) println(i)

  }
}
