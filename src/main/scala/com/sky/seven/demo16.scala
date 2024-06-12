package com.sky.seven
//集的操作
object demo16 {


  def main(args: Array[String]): Unit = {


    val set=Set(1,1,2,3,4,5)


    println(set.size)



    for(i<-set) println(i)

val delSet=set-1

    println(delSet)

    val addset=set++Set(6,7,8)

    println(addset)

    val add2Set=set++List(6,7,8,9)

    println(add2Set)

  }


}
