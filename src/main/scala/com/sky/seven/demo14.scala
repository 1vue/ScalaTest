package com.sky.seven

//并集、交集、差集
object demo14 {


  def main(args: Array[String]): Unit = {


    val list1=List(1,2,3,4)

    val list2=List(1,4,5,6)

    val unionlist=list1.union(list2)

    val dislist=unionlist.distinct

    val inlist=list1.intersect(list2)

    var dilist=list1.diff(list2)

    println(unionlist)

    println(dislist)
    println(inlist)

    println(dilist)


  }

}
