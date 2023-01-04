package com.tutorial.interfacekeyword;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();

    car.drive();
    int tire = car.getTire();

    String name = car.getClass().getSimpleName();

    System.out.println(name + " had " + tire + " tire");
    System.out.println(name + " from " + car.getBrand());

    System.out.println("Bus");
    Car bus = new Bus();
    bus.drive();
    System.out.println(bus.getTire());
    System.out.println(bus.isBig());

  }
}
