package com.tutorial.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {

    try(FileReader fileReader = new FileReader("README.md");
        BufferedReader bufferedReader = new BufferedReader(fileReader)
    ){

      while(true){
        String data = bufferedReader.readLine();
        if(data == null){
          break;
        }
        System.out.println(data);
      }

    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
