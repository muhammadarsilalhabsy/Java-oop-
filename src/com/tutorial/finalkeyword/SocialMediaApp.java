package com.tutorial.finalkeyword;

public class SocialMediaApp {
  public static void main(String[] args) {

    SocialMedia sm = new SocialMedia();
    sm.name = "This is a parent";

    System.out.println(sm.name);
    System.out.println(sm.VERSION);
    sm.thisMe();
    sm.tagLine();

    System.out.print("\n\n");
    SocialMedia fb = new Facebook();
    fb.name = "This is a child (Facebook)";
    System.out.println(fb.name);
    System.out.println(fb.VERSION);
    fb.thisMe();
    fb.tagLine();


  }
}
