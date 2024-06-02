package com.sky.demo5

class Customer (var name:String="张三",var address:String){

  print("主构造器")
def this(arr:Array[String]) {
  this(arr(0),arr(1))
print("辅助构造器")
}

}
