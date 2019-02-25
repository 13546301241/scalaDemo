object Demo07{

  def main(args: Array[String]): Unit = {

    //元组
    //创建元组
    var t = ("hadoop",11,22.5)
    println("元组为: "+t)

    //从元组中获取值
    //想要获取值，便需要利用角标，但值得注意的是，元组中的角标是从 1 开始的
    var i1 = t._1
    println("元组第一个元素为： "+i1)

    //zip，可将两个相同长度的数组进行合并
    var new1 = Array("Uzi","TheShy","GODV")
    var new2 = Array("RNG","IG","LGD")
    var newNew = new1.zip(new2)
    println(newNew.toBuffer)

  }
}
