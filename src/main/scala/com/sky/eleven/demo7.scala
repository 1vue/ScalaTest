package com.sky.eleven

object demo7 {

  def main(args: Array[String]): Unit = {

    val email="263730478@qq.com"

    val test=""".+@.+\..+""".r

    
    if(test.findAllIn(email).size!=0)
      {
        println(s"email = ${email}为有效邮箱")
      }
      else {
        println(s"email = ${email}为无效邮箱")
      }

  }



}
