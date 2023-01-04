package com.tutorial.Data;

public class Person {
  public String name;
  public int age;
  public final String country = "Indoensia";

  public void sayHallo(String name){
    System.out.println("Hallo " + name + ", My name is " + this.name + ", i'm " + this.age + " years old!");
  }
}
