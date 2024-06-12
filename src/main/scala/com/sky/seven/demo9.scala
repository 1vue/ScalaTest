package com.sky.seven

import scala.collection.mutable.ListBuffer

object demo9 {

  def main(args: Array[String]): Unit = {


    val list=ListBuffer(1,2,3)

    println(list)

    list+=4
    println(list)
    list++=List(5,6,7)
    println(list)
    list-=7
    println(list)
    list--=List(3,4)
    println(list)

 var list2=   list.toList

    println(list2)

    val list3=list.toArray

    println(list3)
  }


}
