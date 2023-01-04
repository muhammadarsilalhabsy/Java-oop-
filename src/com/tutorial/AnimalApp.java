package com.tutorial;

import com.tutorial.constructor.Animal;

import java.util.Arrays;

public class AnimalApp {
  public static void main(String[] args) {

    Animal kuda = new Animal("Mamalia", 4);
    kuda.favFood = new String[] {"Rumput","Sayur","Air Bening"};
    System.out.println(kuda.jenis);
    System.out.println(kuda.legs);
    System.out.println(Arrays.toString(kuda.favFood));
  }
}
