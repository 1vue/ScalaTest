package com.sky.nine

object demo9 {

  def main(args: Array[String]): Unit = {

    val list=List("张三"->12,"李四"->13,"王五"->15)

    val map=list.groupBy(x=> x._2>=13)

    val map2=map.map(x=> {x._1 ->x._2.length    })

    map2.foreach(println(_))

  }

}
