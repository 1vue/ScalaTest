package com.sky.seven

//扁平化嵌套列表
object demo11 {

  def main(args: Array[String]): Unit = {


    val list1=List(List(1,2),List(1),List(4,5),List(5,3))

    val list2=list1.flatten

    println(list2)


  }

}
