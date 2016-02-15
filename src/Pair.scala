/**
 */
class Pair[T:Ordering](val first:T,val second:T) {
   def smaller(implicit ord:Ordering[T])={
      println(ord)
     if(ord.compare(first,second)<0) first else second
   }

   def bigger()={
     import Ordered._
     if(first > second) first else second
   }
}

object Pair extends App{
  println(new Pair[Int](40,2).smaller)
  println(new Pair[Int](40,2).bigger())
  println(new Pair(40L,2L).bigger())
}
