package com.sky.fifteen

import scala.collection.mutable
import scala.io.StdIn

object demo10 {
  def main(args: Array[String]): Unit = {


    println("请输入字符串：")
    val str=StdIn.readLine()

    val map=mutable.Map[Char,Int]()



val chars=str.toCharArray
chars.foreach{
  case x if  !map.contains(x) => map+=x->1

case x => map+=x->(map.getOrElse(x,1)+1)

}

    map.foreach(println(_))


  }
}
