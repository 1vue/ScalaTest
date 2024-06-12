package com.sky.eleven

object demo1 {

  def main(args: Array[String]): Unit = {


    val arr1=Array(1,2,3)
val arr2=Array(2)
    val arr3=Array(1,2,5,63,5)

    arr3 match {
      case Array(1,x,y) =>println("长度为3")
      case Array(2)=>println("匹配到长度为1的数组")
      case Array(1,_*)=>println("以1开头")

      case _=>println("匹配失败")
    }

  }



}
