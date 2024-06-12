package com.sky.fifteen

import scala.collection.mutable

object demo7 {
  def main(args: Array[String]): Unit = {

    val q=mutable.Queue(1,2,3,4,5)

    q.enqueue(6)
    q.enqueue(7,8,9)

    println(q)

    q.dequeue()
    println(q)

    q.dequeueFirst(_%2!=0)
    println(q)

    q.dequeueAll(_%2==0)
    println(q)






  }
}
