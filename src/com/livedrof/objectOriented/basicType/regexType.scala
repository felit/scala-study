package com.livedrof.objectOriented.basicType

import scala.util.matching.Regex

/**
 *
 */
object regexType {
  def main(args: Array[String]) {
    val numPattern = new Regex("[0-9]+")
    print(numPattern)
    print(System.currentTimeMillis())

//    assert(numPattern.equals("[0-9]+".r))
  }
}
