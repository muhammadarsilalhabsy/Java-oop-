package com.tutorial.recordclass;

public record LoginRequest(String name, String password) {

  // default constructro
  public LoginRequest{
    System.out.println("Ini akan selalu di panggil");
  }

  public LoginRequest(String name){
    this(name,null);
  }

  public LoginRequest(){
    this(null,null);
  }

  // bisa membuat method
  public void sayHallo(){
    System.out.println("Halllo my name is " + this.name);
  }
}
