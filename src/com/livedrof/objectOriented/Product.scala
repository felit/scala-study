package com.livedrof.objectOriented

/**
 *
 */
class Product(ttl: String, p: Double) {
  var title: String = ttl;
  var price: Double = p;

  def print() {

  }

  override def toString(): String = "(" + title + "," + this.price + ")";
}

object Product {
  def main(args: Array[String]) {
    print(args)
    print(new Product("hello", 900))
  }
}
