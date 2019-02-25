package cn.jiyun.main

import scala.actors.Actor

object Demo13 {

  def main(args: Array[String]): Unit = {

    var demo13 = new Demo13
    demo13.start()
    demo13 ! "three"
    demo13 ! "two"
    demo13 ! "one"
  }
}
class Demo13 extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case "one" => {
          println("This is One")
        }
        case "two" => {
          println("Today is goodlucky")
        }
        case  _ => {
          println("无法识别")
        }
      }
    }
  }
}
