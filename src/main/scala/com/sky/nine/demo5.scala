package com.sky.nine
//过滤
object demo5 {
  def main(args: Array[String]): Unit = {

    val list1=1 to 9

  // val list2= list1.filter(x=>x%2==0)
val list2=list1.filter(_%2==0)
    list2.foreach(println(_))
    


  }
}
