package com.sky.nine

object demo2 {
  def main(args: Array[String]): Unit = {



    val list=List(1,2,3)

    list.foreach((x:Int)=>println(x))

//    简写
list.foreach(x=>println(x))


//    若函数参数只在函数体中出现一次，且函数体没有涉及复杂的使用，如嵌套等，即可使用下划线来优化函数定义
    list.foreach(println(_))


  }


}
