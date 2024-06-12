package com.sky.eleven

object demo5 {

  def main(args: Array[String]): Unit = {


    val p :PartialFunction[Int,String] ={
      case 1 =>"一"
      case 2 =>"二"
      case 3 =>"三"
case _=>"未匹配"
    }
    println(p(1))
    println(p(2))
    println(p(4))
  }


}
