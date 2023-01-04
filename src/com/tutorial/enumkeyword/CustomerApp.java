package com.tutorial.enumkeyword;

public class CustomerApp {
  public static void main(String[] args) {

    Customer customer = new Customer();
    customer.level = Level.STANDARD;
    System.out.println(customer.level);
    System.out.println(customer.level.getDesc());

    // konversi enum to string
    System.out.println("\nkonversi enum to string");
    String standard = Level.STANDARD.name();
    System.out.println(standard);

    // konversi string to enum
    System.out.println("\nkonversi string to enum");
    Level premium = Level.valueOf("PREMIUM");
    System.out.println(premium.getDesc());

    // mengambil semua list enum yang ada
    System.out.println("\nLists enum");
    Level[] lists = Level.values();

    for(Level filed : lists){
      System.out.println(filed);
    }

  }
}
