package com.tutorial.error;

import com.tutorial.recordclass.LoginRequest;

public class ValidationUtil {

  public static void validate(LoginRequest user) throws ValidationException, NullPointerException{
    if(user.name() == null){
      throw new ValidationException("Username tidak boleh null");
    } else if (user.name().isBlank()) {
      throw new NullPointerException("Username tidak boleh kosong");
    } else if (user.password() == null) {
      throw new ValidationException("Password tidak boleh null");
    } else if (user.password().isBlank()) {
      throw new NullPointerException("Password tidak boleh kosong");

    }
  }

  public static void validateRuntime(LoginRequest user){
    if(user.name() == null){
      throw new NullPointerException("Username tidak boleh null");
    } else if (user.name().isBlank()) {
      throw new BlankException("Username tidak boleh kosong");
    } else if (user.password() == null) {
      throw new NullPointerException("Password tidak boleh null");
    } else if (user.password().isBlank()) {
      throw new BlankException("Password tidak boleh kosong");

    }
  }
}
