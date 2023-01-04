package com.tutorial.interfacekeyword;

public interface Car extends HasBrand, IsMaintenance{

  String name = "Car"; // harus di deklarasi kan langsung
  // defalut public abstract void drive();

  void drive(); // recommended
  int getTire();

  default boolean isBig(){
    return false;
  }

}
