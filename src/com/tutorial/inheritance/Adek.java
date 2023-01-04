package com.tutorial.inheritance;

public class Adek extends Bapak{
  public String name;
  @Override
  public void callSomay(){
    System.out.println("Mac, " + this.name + " mau beli, nanti bapak " + super.name + " yang bayar");
  }
}
