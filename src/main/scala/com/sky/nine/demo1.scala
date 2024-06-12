package com.sky.nine

//迭代器获取元素
object demo1 {

  def main(args: Array[String]): Unit = {


    val list =List(1,2,3,4)

    val it=list.iterator

    while (it.hasNext){

      println(it.next())

    }


  }


}
