package com.tutorial.constructor;

public class Animal {

  public String jenis;
  public int legs;
  public String[] favFood;

  public Animal(String jenis, int legs){
    this.jenis = jenis;
    this.legs = legs;
  }

  // constructor overloading
  public Animal(String jenis) {
//    this.jenis = jenis;
//    or
    this(jenis, 0); // memanggil constructor lain
  }

  public Animal(){
    this(null);
  }



}
