package com.tutorial.pholymorphism;

import com.tutorial.superkeyword.Employee;
import com.tutorial.superkeyword.Manager;
import com.tutorial.superkeyword.VicePresident;

public class MethodPolymorphism {
  public static void main(String[] args) {

    sayWhatsUp(new Employee("Arsil"));
    sayWhatsUp(new Manager("Eko"));
    sayWhatsUp(new VicePresident("tsar"));


  }
  private static void sayWhatsUp(Employee employee){
    System.out.println("What's up " + employee.name);
  }
}
