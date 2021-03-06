package com.livedrof.objectOriented.basicType
import scala.reflect.runtime.universe._

object stringType {
  /**
   * using the Option/Some/None Pattern instead of null
   * @param args
   */
  def main(args: Array[String]) {
    val s1: String = "test"
    val s2: String = "t" + "est"
    val s3: String = "Test"

    assert(s1 == s2)
    assert(s1.equals(s2))
    println(s1.getBytes)
    println(s2 == s3) //false
    println(s2.toUpperCase() == s3.toUpperCase()) //true
    println("s2.equalsIgnoreCase(s3):" + s2.equalsIgnoreCase(s3))
    println(s3.toLowerCase)
    // multiline string
    val multilineStr = """
                         |here is the multiline String
                         |""".stripMargin('|')
    println(multilineStr)
    // from scala2.10
    println(s"hello: $multilineStr")
    println(f"title:${"product"},price:${300}%.2f")

    // processing a String One Character at a Time
    for (c <- "hello") println(c)
    val c: String = "Hello World"
    println(c.map(_.toUpper))
    println(c.map(s => s.toUpper))
    println(c.filter(_ != 'l').map(_.toUpper))

  }
}
