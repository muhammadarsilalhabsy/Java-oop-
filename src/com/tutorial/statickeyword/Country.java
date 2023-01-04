package com.tutorial.statickeyword;

public class Country {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static class City{
    private String name;

    // tidak bisa mengakses outer, karena sudah static
//    public String getCountry(){
//      return Country.this.getName();
//    }
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}

