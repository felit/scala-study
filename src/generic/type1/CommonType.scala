package generic.type1

/**
  */
class ParentType {

}

class ChildType extends ParentType {

}

object CommonType extends App {
  type Arr = Array[T] forSome {type T <: ParentType}
  val arr: Arr = new Array[ParentType](9)
  arr.+("w")
  println(arr)
  println(arr.last)
  type D[T] = Array[T] forSome {type T}
//  println(new D[String]) // class type required but Array[_] found
}
