package com.tutorial.superkeyword;

public class Employee {
  public String name;

  public Employee(String name){
    this.name = name;
  }

  public Employee(){
  }

  public void sayHallo(String name){
    System.out.println("haii " + name + "my name is Employee " + this.name);
  }
}
