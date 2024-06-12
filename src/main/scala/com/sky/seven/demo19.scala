package com.sky.seven


import scala.collection.mutable.Map

object demo19 {


  def main(args: Array[String]): Unit = {

val map=Map("张三"->23,"李四"->24)

    map++=Map("李四"->30)
map("张三")=30

    println(map)

  }

}
