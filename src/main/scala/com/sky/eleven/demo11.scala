package com.sky.eleven

import scala.io.StdIn

object demo11 {

  def main(args: Array[String]): Unit = {

    println("请输入数字")
val number=StdIn.readInt()

number match {
  case 1 => println("1")
  case 2 => println("2")
  case 3 => println("3")
  case 4 => println("4")
  case 5 => println("5")

  case _=> println("未匹配")
}

  }


}
