package com.tutorial.interfacekeyword;

public class Bus implements Car, IsMaintenance{
  @Override
  public void drive() {
    System.out.println("Drive Bus");
  }

  @Override
  public int getTire() {
    return 8;
  }

  @Override
  public String getBrand() {
    return "Mitsubishi";
  }

  @Override
  public boolean isMaintenance() {
    return false;
  }

  public boolean isBig(){
    return true;
  }
}
