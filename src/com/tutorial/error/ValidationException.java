package com.tutorial.error;

public class ValidationException extends Throwable{

  public ValidationException(String massage){
    super(massage);
  }
}
