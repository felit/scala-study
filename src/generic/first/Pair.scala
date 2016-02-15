package generic.first

/**
 * Created by congsl on 16-2-12.
 */
class Pair(var first: String, var second: String) {
  def swap() = {
    var sw = first
    first = second
    second = sw
  }


  override def toString = s"Pair($first, $second)"
}


class Pair2[T](var first: T, var second: T) {
  def swap = {
    val sw: T = first
    first = second
    second = sw
  }
  def middle[R <: Iterable[T]](input : R)={

  }


  override def toString = s"Pair2($first, $second)"
}


object Pair extends App {
  println(new Pair("hello", "world"))
  println(new Pair2("hello", "world"))
}

class Pair3[T,S]{
  def swap = {

  }
}