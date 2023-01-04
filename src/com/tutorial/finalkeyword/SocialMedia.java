package com.tutorial.finalkeyword;

public class SocialMedia {
  String name;
  final int VERSION = 2;

  public void tagLine(){
    System.out.println("We made it");
  }

  public final void thisMe(){
    System.out.println("Social");
  }
}

final class Facebook extends SocialMedia{
  public void tagLine(){
    System.out.println("We did it");
  }

//  ERROR (tidak bisa override method final)
//  public void thisMe(){
//    System.out.println("xixixi");
//  }
}

// ERROR cannot inherit/extends final class
//class FakeFacebook extends Facebook{
//
//}
