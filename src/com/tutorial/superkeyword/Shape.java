package com.tutorial.superkeyword;

public class Shape {
  public int getCorner(){
    return 0;
  }
}

class Rectangle extends Shape{

  @Override
  public int getCorner(){
    return 4;
  }

  public int getParentCorner(){
    return super.getCorner();
  }
}
