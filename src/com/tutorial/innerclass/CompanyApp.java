package com.tutorial.innerclass;

public class CompanyApp {
  public static void main(String[] args) {

    Company company = new Company();
    company.setName("Arsil corp");
    System.out.println(company.getName());

    // cara mengdeklarasi object inner class dari company
    Company.Employee employee = company.new Employee();
    employee.setName("ucup");
    System.out.println(employee.getName());

    // kelebihan: kita bisa mengakses field private dari outerclasssnya
    System.out.println(employee.getCompanyName());



  }
}
