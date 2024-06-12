package com.sky.nine



//map方法
object demo3 {
  def main(args: Array[String]): Unit = {

    val list=List(1,2,3,4)

  val list2=  list.map((x:Int)=>{ "*" * x })



list2.foreach(println(_))

    val list3=list.map(x=>"*"*x)
list3.foreach(println(_))

    val list4=list.map("*"*_ )

    list4.foreach(println(_))

  }



}
