package com.sky.seven

import scala.collection.mutable.Map

object demo20 {
  def main(args: Array[String]): Unit = {

    val map=Map("张三"->23,"李四"->24)

 //   println(map("张"))

    println(map.keys)

    println(map.values)

    for(i<-map) println(i)

    println(map.getOrElse("王五", -1))

    map++=Map("王五"->25)

    println(map.getOrElse("王五", -1))

   map-="李四"

    for(i<-map) println(i)

  }
}
