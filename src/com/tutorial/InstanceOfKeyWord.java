package com.tutorial;

import com.tutorial.superkeyword.Employee;
import com.tutorial.superkeyword.Manager;
import com.tutorial.superkeyword.VicePresident;

public class InstanceOfKeyWord {
  public static void main(String[] args) {

    sayHallo(new Manager("Arsil"));
    sayHallo(new VicePresident("Eko"));
    sayHallo(new Employee("Japri"));


    sayHaaaa(new VicePresident("Junaedi"));
    // sayHaaaa(new Manager("Junaedi"));// error

    // alurnya seperti ini
    Employee employee = new VicePresident("hokage");
    VicePresident vicePresident = (VicePresident) employee; // bisa
    System.out.println(vicePresident.name);


  }
  static void sayHaaaa(Employee employee){
    VicePresident vp = (VicePresident) employee;
    System.out.println("Hai VP " + vp.name);
  }
  static void sayHallo(Employee employee){

    if (employee instanceof VicePresident){
      System.out.println("Hallo VicePresident " + employee.name);
    }else if (employee instanceof Manager){
      System.out.println("Hallo Manager " + employee.name);
    }else{
      System.out.println("Hallo Employee " + employee.name);
    }
  }
}
