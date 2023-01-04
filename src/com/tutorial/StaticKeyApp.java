package com.tutorial;

import com.tutorial.statickeyword.Application;
// static import
import static com.tutorial.statickeyword.Constant.VERSION;
import com.tutorial.statickeyword.Constant;
import com.tutorial.statickeyword.Country;
import com.tutorial.statickeyword.MathUtil;

public class StaticKeyApp {
  public static void main(String[] args) {

    // static field
    System.out.println(VERSION);
    System.out.println(Constant.APPLICATION);

    // static method
    int sum = MathUtil.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);// 55
    System.out.println(sum);

    // static inner class
    Country.City kendari = new Country.City();
    kendari.setName("Kendari");
    System.out.println(kendari.getName());

    // static block
    System.out.println(Application.PROCESSORS);
  }
}
