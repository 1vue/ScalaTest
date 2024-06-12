package com.sky.forteen

object demo4 {
  def main(args: Array[String]): Unit = {
    val t1=Traversable(1,2,3,4,5,6,7,8,9,10)

    val t2:Traversable[Int]=t1.collect({
      case x if x%2==0 => x
    })



t2.foreach(println(_))

  }
}
