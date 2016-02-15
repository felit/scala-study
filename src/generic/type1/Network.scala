package generic.type1

import scala.collection.mutable.ArrayBuffer

/**
  */
class Network {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]()

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

object Network extends App {
  val chatter = new Network
  val myFace = new Network

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  val barney = myFace.join("Barney")

  def process[M <: n.Member forSome {val n : Network}](m1: M, m2: M) = (m1, m2)
  process(fred,wilma)
//  process(fred,barney)
  def foo(x :List[_>:Int]) = x
  println(foo(List("Hello")))
  val arr = new Array[Int](9)
  arr.addString(new StringBuilder("2222"))
  println(arr)
}
