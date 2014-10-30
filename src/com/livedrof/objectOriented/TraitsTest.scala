package com.livedrof.objectOriented

/**
 *
 */
object TraitsTest {
  def main(args: Array[String]) {
    var p1 = new Point(2, 3)
    var p2 = new Point(2, 4)
    var p3 = new Point(3, 3)

    println(p1.isNotSimilar(p2))
    println(p1.isNotSimilar(p3))
    println(p1.isNotSimilar(2))
  }

}

trait Similarity {
  def isSimilar(x: Any): Boolean

  def isNotSimilar(x: Any): Boolean = !isSimilar(x)

}

class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc

  def isSimilar(obj: Any): Boolean =
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x

  override def toString(): String = "(" + x + "," + y + ")"
}
