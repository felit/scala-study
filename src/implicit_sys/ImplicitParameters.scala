package implicit_sys

/**
  */
class ImplicitParameters {
  def test(text: Int)(implicit k: String) = {
    print(text, k)
  }

  def tt: Unit = {
    //    print(this.test(500)) //Error Error:Error:line (12)could not find implicit value for parameter k: String
    this.test(9)("333")
  }
}

object ImplicitParameters extends App {
  new ImplicitParameters().tt
}
