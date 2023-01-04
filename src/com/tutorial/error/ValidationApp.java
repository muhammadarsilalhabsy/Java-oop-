package com.tutorial.error;

import com.tutorial.recordclass.LoginRequest;

public class ValidationApp {

  public static void main(String[] args) {
    LoginRequest user1 = new LoginRequest(null, "rahasia");

    try {
      System.out.println("Start");
      ValidationUtil.validate(user1);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException e) {
      System.err.println(e.getMessage());
    }


    System.out.println("Start");
    // kelihatanya clean, tapi harus di hendel di tempat lain
    ValidationUtil.validateRuntime(new LoginRequest("saya",""));
    System.out.println("Finish");

  }

}
