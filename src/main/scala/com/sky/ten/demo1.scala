package com.sky.ten

import scala.io.StdIn

object demo1 {

  def main(args: Array[String]): Unit = {

print("请输入单词：")
    val word =StdIn.readLine()

  val res=  word match {
      case "apple" => "这是苹果"
      case "banana"=>"这是香蕉"
      case "peach"=>"这是桃子"

      case _=>"这是水果"
    }

    println(res)

  }



}
