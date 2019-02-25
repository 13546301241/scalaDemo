package cn.jiyun.main

import scala.actors.Actor

case class PhoneNumber(phoneNumber: String,phoneUser:String)
case class Goods(id:String,typeGoods:String)

object Demo14{
  def main(args: Array[String]): Unit = {
    var demo14 = new Demo14
    demo14.start()
    demo14 ! "一条凑热闹的消息"
    demo14 ! PhoneNumber("张三","13545671210")
    demo14 ! Goods("001","食品")
  }
}

class Demo14 extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case "start" =>println("starting...")
        case PhoneNumber(phoneNumber:String,phoneUser:String) =>{
          println(phoneUser+"的手机号码是： "+phoneNumber)
        }
        case Goods(id:String,typeGoods:String) => {
          println("开始查找")
          print(".")
          Thread.sleep(1000)
          print(".")
          Thread.sleep(1000)
          print(".")
          Thread.sleep(1000)
          print(".")
          Thread.sleep(1000)
          println()
          println(typeGoods+"类型商品的id为： "+id)
        }
        case _ => {
          println("无法识别的消息")
        }
      }
    }
  }
}
