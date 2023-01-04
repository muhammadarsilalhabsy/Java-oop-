package com.tutorial.abstrakclass;

public class AnimalApp {
  public static void main(String[] args) {

    Animal animal = new Cat();

    animal.name = "Moly";
    animal.talk("Meaow!");
    animal.run();

  }
}
