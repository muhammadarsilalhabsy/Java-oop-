package com.tutorial.abstrakclass;

public abstract class Animal {
  String name;
  public abstract void run();
  public void talk(String sound){
    String className = this.getClass().getSimpleName();
    System.out.println(className + " sound like " + sound);
  }
}
