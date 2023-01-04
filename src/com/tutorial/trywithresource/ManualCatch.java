package com.tutorial.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManualCatch {
  public static void main(String[] args) {
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try {
      fileReader = new FileReader("README.md");
      bufferedReader = new BufferedReader(fileReader);

      while (true) {
        String data = bufferedReader.readLine();
        if (data == null) {
          break;
        }
        System.out.println(data);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try{
        if(fileReader != null && bufferedReader != null){
          fileReader.close();
          bufferedReader.close();
        }
        System.out.println("Success menutup file");
      }catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}
