package com.sky.forteen

object demo3 {


  def main(args: Array[String]): Unit = {

    val t1=List(1,2,3).toTraversable
    val t2=Traversable(3,2,4)
    val t3=Traversable(1,5,9)

    val t4:Traversable[Int]=Traversable.concat(t1,t2,t3)

    println(t4)
    
  }



}
