package com.sky.ten

import scala.io.StdIn

object demo3 {
  def main(args: Array[String]): Unit = {
    val a:Int=StdIn.readInt()

    a match {
      case x if x>=0&&x<=3 =>println("[0-3]")
      case x if x>=4&&x<=8=>println("[4-8]")

      case _=>println("未匹配")
    }
  }
}
