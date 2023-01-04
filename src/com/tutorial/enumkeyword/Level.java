package com.tutorial.enumkeyword;

public enum Level {
  STANDARD("Standard level"),
  PREMIUM("Premium level"),
  VIP("Sultan level");

  private String desc;
//  constructor ( tidak bisa public )
  Level(String desc){
    this.desc = desc;
  }

  public String getDesc(){
    return desc;
  }
}
