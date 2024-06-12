package com.sky.seven

//拉链与拉开
object demo12 {


  def main(args: Array[String]): Unit = {
    val names =List("张三","李四","王五")
    val ages=List(23,24,25)
   // println(ages.mkString("_"))

    val list =names.zip(ages)

    println(list)

    val tuple=list.unzip

    println(tuple)
  }


}
