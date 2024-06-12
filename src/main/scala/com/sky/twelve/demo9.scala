package com.sky.twelve

object demo9 {


  class RichList(list:List[Int]){


    def avg()={
      var sum=0
      list.foreach(sum+=_)
      sum/list.size
    }

  }

  def main(args: Array[String]): Unit = {

    implicit def change(list: List[Int])= new RichList(list)

    val list=(1 to 10).toList
    val avg=list.avg()
    println(avg)
  }

}
