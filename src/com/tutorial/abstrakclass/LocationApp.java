package com.tutorial.abstrakclass;

public class LocationApp {
  public static void main(String[] args) {

    // Location location = new Location(); // tidak bisa di instansiate

    Location location = new City();
    location.name = "Kendari";
    System.out.println(location.name);
  }
}
