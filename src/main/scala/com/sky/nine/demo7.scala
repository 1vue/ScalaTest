package com.sky.nine

object demo7 {


  def main(args: Array[String]): Unit = {

    val list=List("01 apple","02 watermelon","03 banana","04 peach")

    val list2=list.sortBy((x:String)=>x.split(" ")(1))

    list2.foreach(x=>print(x+" "))


  }

}
