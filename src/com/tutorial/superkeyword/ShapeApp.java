package com.tutorial.superkeyword;


public class ShapeApp {
  public static void main(String[] args) {

    Shape shape = new Shape();
    System.out.println(shape.getCorner()); // 0

    Rectangle rectangle = new Rectangle();
    System.out.println(rectangle.getCorner()); // 4
    System.out.println(rectangle.getParentCorner()); // 0
  }
}
