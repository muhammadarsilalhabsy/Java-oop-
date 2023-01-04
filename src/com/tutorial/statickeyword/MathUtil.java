package com.tutorial.statickeyword;

public class MathUtil {

  public static int sum(int... data){
    int total = 0;
    for (int temp : data) {
      total += temp;
    }
    return total;
  }
}
