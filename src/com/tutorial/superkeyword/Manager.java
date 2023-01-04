package com.tutorial.superkeyword;

public class Manager extends Employee{

  public String company;

  public Manager(String name){
    super(name);
  }
  // akan menjadi tidak wajib di override oleh turunannya

  public Manager(String name, String company){
    super(name);
    this.company = company;
  }

  @Override
  public void sayHallo(String name){
    System.out.println("haii " + name + "my name is Manager " + this.name);
  }
}
