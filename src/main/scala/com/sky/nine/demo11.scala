package com.sky.nine

object demo11 {
  def main(args: Array[String]): Unit = {

    val list=1 to 10

    val x=100

    val list2=list.fold(x)((x,y)=>x+y)

//    简写
//val list2=list.fold(x)(_+_)
    println(list2)



  }
}
