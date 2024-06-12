package com.sky.ten

object demo2 {
  def main(args: Array[String]): Unit = {

    val a:Any=3.14

    a match {
      case a:Int =>println("Int")
      case a:String=>println("String")
      case a:Double=>println("Double")

      case _=>println("未匹配")

    }
  }
}
