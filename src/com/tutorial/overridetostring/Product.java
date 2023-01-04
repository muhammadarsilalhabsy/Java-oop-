package com.tutorial.overridetostring;

public class Product {
  String name;
  int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String toString(){
    return "Product : " + name + ", price : " + price;
  }
}
