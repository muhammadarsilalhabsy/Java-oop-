package com.tutorial.inheritance;

public class RumahTanggaApp {
  public static void main(String[] args) {

    Bapak ucup = new Bapak();
    ucup.name = "Ucup";
    ucup.cash = 15000;
    ucup.callSomay();

    // filed dan method dari object Bapak bisa digunakan di object anak

    Anak mail = new Anak();
    mail.name = "Is Mail";
    mail.cash = 5000;
    mail.callSomay();

    // menggunakan method overriding
    Adek abilal = new Adek();
    abilal.name = "Abilal";
    abilal.cash = 1000;
    abilal.callSomay();
  }
}
