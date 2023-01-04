package com.tutorial.anonymousclass;

public class HalloWorldApp {

  public static void main(String[] args) {
    HalloWorld halloWorld = new HalloWorld() {
      @Override
      public void sayHallo() {
        System.out.println("Hallo bang!");
      }

      @Override
      public void sayHallo(String name) {
        System.out.println("Hallo bang " + name + "!");

      }
    };

    halloWorld.sayHallo("Arsil");
  }
}
