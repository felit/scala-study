import java.io.File

import scala.io.Source

/**
 *
 */
class RichFile(val from:File) {
  def read = Source.fromFile(from.getPath).mkString

}
object RichFile2 extends App{
  implicit def file2RichFile(from: File):RichFile = {
    new RichFile(from)
  }
  println(new File("/data/source/scalaDemo/src/Pair.scala").read)
}
