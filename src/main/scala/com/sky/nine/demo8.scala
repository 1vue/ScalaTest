package com.sky.nine

object demo8 {

  def main(args: Array[String]): Unit = {

    val list=List(2,4,5,1,6)

  //  val list2=list.sortWith((x,z)=>x>z)
//简写
val list2=list.sortWith(_>_)

    list2.foreach(println(_))



  }


}
