package cn.jiyun.main

import scala.actors.Actor

object Demo12{
  def main(args: Array[String]): Unit = {
    var demo12 = new Demo12
    demo12.start()
    demo12 ! "start"
    demo12 ! "stop"
    demo12 ! "this is the book"
    println("消息发送完成")
  }
}

class Demo12 extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case "start" => {
          println("starting...")
          Thread.sleep(1000)
          println("started!!")
        }
        case "stop" =>{
          println("stoping...")
        }
        case _ => {
          println("无法识别的消息")
        }
      }
    }
  }
}
