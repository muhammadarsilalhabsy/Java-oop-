package com.tutorial.error.stacktrashelement;

public class Main {
  public static void main(String[] args) {
    System.out.println("start");
    try{
      sampleError();
    }catch (Exception e){
      e.printStackTrace();
    }
    System.out.println("finsih");
  }

  private static void sampleError(){
    try{
      String[] fruits = {"Aple","Manggo","Orange"};
      System.out.println(fruits[10]);
    }catch (Throwable e){
      throw new RuntimeException(e);
    }
  }
}
