package com.sky.nine

object demo4 {
  def main(args: Array[String]): Unit = {

//    1.先map再flatten

    val list=List("apple peach banana","orange watermelon")

    val list2=list.map((x:String)=> x.split(" ") )

    list2.foreach(println(_))

    val list3=list2.flatten

    list3.foreach(println(_))

    //val s=("apple peach banana")

   // s.split(" ").foreach(println(_))

//    2.直接用flattenMap

    val list4=list.flatMap(x=>x.split(" "))
    list4.foreach(println(_))

    val list5=list.flatMap(_.split(" "))
    list5.foreach(println(_))
  }


}
