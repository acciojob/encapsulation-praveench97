package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly rw = new RWOnly();
//      rw.name = "newName";
//      System.out.println(rw.name);
      //name has private access in com.driver.RWOnly

      rw.setName("newName");
      System.out.println(rw.getName());
    }
}