package com.sky.eleven

object demo3 {
  def main(args: Array[String]): Unit = {

    val map=Map("张三"->13,"李四"->23,"王五"->25)


    for((k,v)<-map if v==23) println(s"key = ${k}")

for((k,13)<-map) println(map(k))

  }
}
