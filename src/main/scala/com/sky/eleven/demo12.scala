package com.sky.eleven

object demo12 {

  def main(args: Array[String]): Unit = {

    val list=(1 to 10).toList

    val func=(x:Int)=>{  "*"*x }

//    匿名函数
    //    val list3=list.map(x=>"*"*x)
    //    list3.foreach(println(_))

//    用函数
val list2=list.map(func)
list2.foreach(println(_))

  }
}
