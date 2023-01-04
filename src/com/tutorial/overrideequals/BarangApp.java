package com.tutorial.overrideequals;

public class BarangApp {
  public static void main(String[] args) {

    Barang remote = new Barang("LG", 15_000);
    Barang serep = new Barang("LG", 15_000);
    Barang remote2 = new Barang("Hellbox", 15_000);

    System.out.println(remote.name.hashCode());

    System.out.println(remote == serep); // false

    System.out.println(remote.equals(serep)); // true
    System.out.println(remote.equals(remote2)); // flase

    System.out.println(remote.hashCode());
    System.out.println(serep.hashCode());
    System.out.println(remote2.hashCode());

//    System.out.println(remote.getClass().getSimpleName());
//    System.out.println(remote); // == this
  }

}
