package com.tutorial.pholymorphism;

import com.tutorial.superkeyword.Employee;
import com.tutorial.superkeyword.Manager;
import com.tutorial.superkeyword.VicePresident;

public class PerusahaanApp {
  public static void main(String[] args) {


    Employee employee = new Employee("Ucup");
    System.out.println(employee.name);
    employee.sayHallo("Eko");

    // polymorphism
    employee = new Manager("Arsil","Google");
    System.out.println(employee.name);
    employee.sayHallo("Jamet");
    // System.out.println(employee.company); // kita tidak bisa mengakses field dari manager.
    // karena deklarasinya menggunakan Employee bukan manager


    employee = new VicePresident("Otong");
    employee.sayHallo("Jupri");
    System.out.println(employee.name);



  }
}
