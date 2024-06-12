package com.sky.twelve

import java.io.File
import scala.io.Source

object demo7 {


  class newFile(file: File){

    def read()=Source.fromFile(file).mkString

  }

  object newobj{

    implicit def newfile2(file: File)=new newFile(file)

  }

  def main(args: Array[String]): Unit = {

//import newobj.newfile2
implicit def newfile2(file: File)=new newFile(file)

    val file=new File("data/1.txt")

    println(file.read())
  }
}
