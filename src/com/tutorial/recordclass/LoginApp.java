package com.tutorial.recordclass;

import java.util.Arrays;

public class LoginApp {
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("Arsil","arsil123");
    System.out.println(loginRequest);
    System.out.println(loginRequest.name());
    System.out.println(loginRequest.password());
    loginRequest.sayHallo();

    System.out.println(new LoginRequest("ucup"));
    System.out.println(new LoginRequest());

    LoginRequest coba1 = new LoginRequest("coba1");
    LoginRequest coba2 = new LoginRequest("coba2");
    System.out.println(Arrays.toString(new LoginRequest[] {coba1,coba2}));
  }
}
