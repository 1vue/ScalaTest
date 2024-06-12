package com.sky.forteen

object demo2 {

  def main(args: Array[String]): Unit = {

//    val t1:Traversable[Traversable[Int]]=Traversable(Traversable(1,4,7),Traversable(2,5,8),Traversable(3,6,9))

    val t1:Traversable[Traversable[Int]]=List(List(1,4,7),List(2,5,8),List(3,6,9))

    val t2:Traversable[Traversable[Int]]=t1.transpose

    t1.foreach(println(_))
    t2.foreach(println(_))
  }

}
