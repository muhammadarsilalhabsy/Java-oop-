package com.tutorial;

import com.tutorial.Data.Person;

public class PersonApp {
  public static void main(String[] args) {

    Person arsil = new Person();
    arsil.name = "Muhammad Arsil Alhabsy";
    arsil.age = 21;
    // arsil.country = "Amerika"; // ERROR because field is final

    System.out.println(arsil.name);
    System.out.println(arsil.age);
    System.out.println(arsil.country); // bisa dipanggil, tapi tidak bisa di ubah!

    Person ucup = new Person();
    ucup.name = "Ucup";
    ucup.sayHallo(arsil.name);
  }
}
