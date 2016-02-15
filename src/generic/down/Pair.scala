package generic.down

/**
  */
class Student extends Person {

}

class Person {

}

class Pair[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair(newFirst, second)

  def testCom = first.+("hello")
}

object Pair extends App {
  val pair = new Pair[Student](new Student, new Student)
  println(pair.replaceFirst(new Person).first)
  println(pair.replaceFirst(new Person).second)
  val person:Pair[Person] = pair.replaceFirst(new Person)
//  val person2:Pair[Person] = pair
}
