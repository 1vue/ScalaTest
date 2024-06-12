package com.sky.eleven

object demo8 {
  def main(args: Array[String]): Unit = {


    val list =List("38123845@qq.com","a1da8812f@gmail.com","zhansan@163.com","123afadff.com")

    val reg=""".+@.+\..+""".r

//    val list2=list.filter(x=>   reg.findAllIn(x).size==0 )
    val list2=list.filter( reg.findAllIn(_).size==0 )

    list2.foreach(println(_))

  }
}
