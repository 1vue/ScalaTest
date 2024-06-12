package com.test

import scala.collection.mutable
import scala.io.{Source, StdIn}
import scala.util.matching.Regex

object ConfigParser {


  case class SwitchConfig(name:String,depList:List[Int],metaInfo:Map[String,String],enabled:Boolean=true)

  case class Result(data:Option[Map[String,SwitchConfig]],error:Option[String])

  class ConfigParser{

    def isValidSwitchName(name:String):Boolean={
      val pattern="^[a-zA-Z][a-zA-Z0-9_]*[a-zA-Z0-9]$"
      name.matches(pattern)
    }

    def isValidDepListValue(value:String):Boolean={
      val pattern = """^\[\s*(\d+(\s*,\s*\d+)*)\s*\]$"""
      value.matches(pattern)
    }

    def parse(configStr:String):Result={

      val list=configStr.split("\n").toList.filter(_.trim.nonEmpty)

      var map=Map[String,SwitchConfig]()

      val map2:Map[String,List[String]]= list.groupBy(
        _.split("=")(0).split("\\.")(0)
      )

      //    map2.foreach(println(_))

      map2.foreach { case (key, values) =>
      {

        println(key)

        if(!isValidSwitchName(key)){
          return Result(None,Option(s"${key}:开关名称命名错误"))
        }

        var enabled:Boolean=true
        var depList:List[Int]=List()
        var metaInfo:Map[String,String]=Map()
        values.foreach(x=>{

          val config=x.split("=")
          val value=config(1).trim
          var configName:String=null
          val configNum=config(0).trim.split("\\.")

          configNum match {
            case x if x.size==2=> configName=configNum(1).trim
            case x if x.size==3=> configName="metaInfo."+configNum(2).trim
            case _=>println("未匹配到正确的配置项")
          }
//          println(configName)
          configName match {
            case "enabled" => {
              if(value=="true"||value=="false")
              enabled = value.toBoolean
              else return Result(None,Option(s"${key}.enabled=${value}:开关属性值错误"))
            }
            case "depList" =>  {

if(!isValidDepListValue(value))
  return Result(None,Option(s"${key}.depList=${value}:开关属性值错误或列表为空"))
              val intArray = value.replaceAll("\\s", "")
                .drop(1)
                .dropRight(1)
                .split(",")
                .map(_.toInt)
              depList=intArray.toList

            }
            case x if x.startsWith("metaInfo") =>{
              val name: String = x.split("\\.")(1)
              metaInfo+="metaInfo."+name->value
            }

            case _ => {
//              println("存在多余字段配置")
              return Result(None,Option("存在多余字段配置"))
            }
          }

        }

        )

        map+=(key->SwitchConfig(key,depList,metaInfo,enabled))

      }
      }

      map.foreach(println(_))


      val res=Result(Some(map),None)
      res
    }

  }

  def main(args: Array[String]): Unit = {

    val configStr=Source.fromFile("src/main/scala/com/test/1.txt").mkString


    val parser=new ConfigParser

    val res: Result  = parser.parse(configStr)

    println(res.data,res.error)

    }







}
