package com.tutorial.overrideequals;

import com.tutorial.overridetostring.Product;

import java.util.Objects;

public class Barang {

  public String name;
  public int price;

  public Barang(String name, int price) {
    this.name = name;
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    System.out.println(this);
    System.out.println(this.getClass().getSimpleName());

    Barang barang = (Barang) o;

    if (price != barang.price) return false;
    return Objects.equals(name, barang.name);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + price;
    return result;
  }
// manual
//  public boolean equals(Object o){
//    System.out.println(this);
////    cek apakah object yang dikirimkan sama dengan object sekarang
//    if(o == this){
//      return true;
//    }
////    cek apakah object tidak instanceof barang
//    if(!(o instanceof Barang)){
//      return false;
//    }
//
//    Barang barang = (Barang) o;
//
//    if(this.price != barang.price){
//      return false;
//    }
//
//    if(this.name != null){
//      return this.name.equals(barang.name);
//    }else{
//      return barang.name == null;
//    }

}


