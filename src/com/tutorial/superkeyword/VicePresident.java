package com.tutorial.superkeyword;

public class VicePresident extends Manager{

  // wajib di override apabila tidak ada defalut parameter
  public VicePresident(String name){
    super(name);
  }

  @Override
  public void sayHallo(String name){
    System.out.println("haii " + name + "my name is VP " + this.name);
  }

}
