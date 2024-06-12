package com.sky.forteen

import scala.util.Random

object demo8 {

  case class Student(val name:String,val age:Int)

  def main(args: Array[String]): Unit = {

   val list=List("张三","李四","王五","赵六","田七")

    val t=Traversable.fill(5)(Student(list(Random.nextInt(list.size)),Random.nextInt(10)+20))

val list2=t.toList
//    list2.sortWith((x,y)=>x.age>y.age)
val list3=list2.sortWith(_.age>_.age)

    list3.foreach(println(_))


  }
}
