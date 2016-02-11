/**
 */
class Accounts {

}
object Accounts{
  private  var lastNumber = 0;
  def newUniqueNumber()={ lastNumber +=1;lastNumber}
  def main(args:Array[String]): Unit ={
    print("Hello world!")
    val nums = new Array[Int](10)
    println(nums)
    for (i <- nums) {
println(i)
    }

  }
}
