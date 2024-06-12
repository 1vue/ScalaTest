package com.sky.forteen

object demo1 {
  def main(args: Array[String]): Unit = {

    val t1=Traversable.empty[Int]

    val t2=Traversable[Int](5)



    val t3=Nil

    val t4=List(1,2,3).toTraversable

    val t5=Traversable(1,2,3)

    val t6=Set(1,2,4,5).toTraversable

    val t7=Map("1"->1,"2"->2).toTraversable

   println(t3,t4,t5,t6,t7)



  }
}
