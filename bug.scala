```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App{
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // This will print 15
  println(obj.x) //This will print 5
}
```