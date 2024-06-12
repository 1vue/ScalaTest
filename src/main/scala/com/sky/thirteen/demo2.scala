package com.sky.thirteen

import sun.awt.shell.ShellFolder

import java.io.File

object demo2 {


  def getfile(dir: File): Unit = {

    if (!dir.isDirectory)
      println("输入格式错误")
    else {

      val list = dir.listFiles()
      list.foreach {

        case x if x.isFile => println(x)

        case x => getfile(x)

      }


    }


  }


  def main(args: Array[String]): Unit = {


    getfile(new File("./src"))

  }
}
