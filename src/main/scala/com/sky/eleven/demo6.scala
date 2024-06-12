package com.sky.eleven

object demo6 {

  def main(args: Array[String]): Unit = {


    val list=(1 to 10).toList


//    偏函数结合map实现
val list2=list.map{

  case x if x>=1&&x<=3 => "[1-3]"
  case x if x>=4&&x<=8 =>"[4-8]"

  case _=>"(8-*]"
}

    println(list2)

//    map小括号实现
    val list3=list.map((x:Int)  =>{
      if(x>=1&&x<=3)
        "[1-3]"
      else if(x>=4&&x<=8)
        "[4-8]"
      else
        "(8-*]"
    })

    println(list3)

  }



}
