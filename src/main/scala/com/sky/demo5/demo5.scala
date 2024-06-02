package com.sky.demo5

object demo5 {

  def main(args: Array[String]): Unit = {
    var p=new Customer(Array("张三","北京"))
    var p1=new Customer("李四","上海")
    println(p.name,p.address)
    println(p1.name,p1.address)
  }

}
