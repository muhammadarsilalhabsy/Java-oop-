package com.tutorial.error;

public class DatabaseApp {
  public static void main(String[] args) {

    connectDatabase("Arsil",null);
  }
  public static void connectDatabase(String username, String password){

    if(username == null || password == null){
      throw new DatabaseError("Tidak bisa connect database!");
    }
  }
}
