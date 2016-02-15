package generic
case class Person()
case class Student()// extends Person

/**
 */
class Pair[T,S](var first: T, val second: S) {
//  定义返回值
  def get_first:T= first
//  定义参数
  def setFirst(f:T)= first = f
//  def gen_instance[H <: Class]= new H()
  def getMiddle[H](a:Array[H]) = a(a.length/2)

}
object Pair extends App{
  val pair = new Pair[Int,Long](1,2)
  println(pair.first.getClass)
  pair.setFirst(50)
  println(pair.get_first)
  val result = pair.getMiddle[Int](Array.apply(1,2,6,3,4))
  println(result)
//  返回函数
  val f  = pair.getMiddle[String] _
  println(f(Array("hello","world","nihao")))
//  println(pair.gen_instance[Pair.type ])
  val stu = new Pair[Student,Person](new Student(),new Person())
  println(stu)
}
