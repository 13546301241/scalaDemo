object Demo{
  def main(args: Array[String]): Unit = {

    //使用val定义的变量是不可变的，相当于java中的final
    val i = 1;
    println(i);
    //使用var定义的变量是可变的
    var j = "你好";
    println(j);
    //if...else
    var k = if (20>30) "20大于30" else "20小于30";
    println("k的值为： "+k);

    //当没有写else的时候 则会自动补全为()
    var i1 = if (30>40) "30大于40"
    println("i1 = "+i1)

    var i2 = if (20>30) "20大于30" else if (20<30) "20小于30" else "20等于30"
    println("i2 = "+i2)
  }
}
