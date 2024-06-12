package com.sky.thirteen

object demo8 {



class Super

  class sub extends Super

  class temp[T]

  class temp1[+T]{

  }
  class temp2[-T]

  def main(args: Array[String]): Unit = {

val t=new temp[sub]
//    val t_1:temp[Super]=t          //非变，会报错

val t1_1=new temp1[sub]()
val t1_2:temp1[Super]=t1_1                     //协变没问题

    val t2_1=new temp2[sub]
//    val t2_2:temp2[Super]=t2_1      //逆变，父子关系反过来，成子父关系

    val t2_3=new temp2[Super]
    val t2_4:temp2[sub]=t2_3                       //逆变，子父关系没问题

  }
}
