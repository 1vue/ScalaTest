package com.sky.demo10

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template

import java.text.SimpleDateFormat
import java.util.Date

object demo10 {


  object DateUtil{
    var sdf:SimpleDateFormat=null

    def dateToString(date:Date,template:String)={
      sdf=new SimpleDateFormat(template)
      sdf.format(date)
    }

    def stringToDate(dateString:String,template: String)={
      sdf=new SimpleDateFormat(template)
      sdf.parse(dateString)

    }



  }

  def main(args: Array[String]): Unit = {
    println( DateUtil.dateToString(new Date(),"yyyy年MM月dd日"))
    println(DateUtil.stringToDate("2024年6月1日","yyyy年MM月dd日"))
  }

}
