package com.tutorial.innerclass;

public class Company {
  private String name;

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

//  inner class
  public class Employee {
    private String name;

    public String getName(){
      return name;
    }

    public void setName(String name){
      this.name = name;
    }

    public String getCompanyName(){
//      return Company.this.getName();
      return Company.this.name;
    }
  }
}
