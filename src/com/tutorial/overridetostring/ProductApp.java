package com.tutorial.overridetostring;

public class ProductApp {
  public static void main(String[] args) {


    Product mac = new Product("Old vans", 8_00_000);

    // tidak akan memprint namaclass + @ + hashCode
    System.out.println(mac); // karena mengoverride method to string
  }
}
