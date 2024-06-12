package com.sky.nine

object demo10 {
  def main(args: Array[String]): Unit = {

val list=1 to 10

    val list2=list.reduce((x,y)=>x+y)

val list3=list.reduce((x,y)=>x-y)
    println(list3)

    val list4=list.reduceRight((x,y)=>x-y)
    println(list4)

    val list5=list.reduceLeft((x,y)=>x-y)
    println(list5)

  }
}
