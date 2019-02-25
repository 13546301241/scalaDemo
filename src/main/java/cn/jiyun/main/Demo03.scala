object Demo03{

  def main(args: Array[String]): Unit = {

    //调用方法method1，同时并传入h1函数
    var result1 = method1(h1)
    print(result1)

    println()

    //调用方法method2，同时并传入函数h2
    var result2 = method2(h2)
    print(result2)

    println()

  }

  //定义一个方法
  def method1(f : (Int,Int) => Int) : Int = {
    f(2,6)
  }
  //定义第二个方法
  def method2(f: (Int,Int) => Int) : Int = {
    f(3,3)
  }
  //定义一个函数
  var h1 = (x:Int , y:Int) => x+y

  //定义第二个函数
  var h2 = (x:Int,y:Int) => x*y

}
