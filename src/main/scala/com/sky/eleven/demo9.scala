package com.sky.eleven

object demo9 {
  def main(args: Array[String]): Unit = {

    val list =List("38123845@qq.com","a1da8812f@gmail.com","zhansan@163.com","123afadff.com")

    val reg=""".+@(.+)\..+""".r


    val list2=list.map{

      case x @ reg(company)=> x->company
      case x=>x->"未匹配"

    }
    list2.foreach(println(_))

  }


}
