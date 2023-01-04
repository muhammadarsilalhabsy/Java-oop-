package com.tutorial.statickeyword;

public class Application {
  public static final int PROCESSORS;


  static {
    System.out.println("Start");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
    System.out.println("Finish");
  }
}
