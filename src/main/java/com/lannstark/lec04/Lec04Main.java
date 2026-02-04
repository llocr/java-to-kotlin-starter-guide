package com.lannstark.lec04;

public class Lec04Main {

  public static void main(String[] args) {
    // JavaMoney money1 = new JavaMoney(1_000L);
    // JavaMoney money2 = new JavaMoney(2_000L);
    // System.out.println(money1.plus(money2));
    
    JavaMoney money1  = new JavaMoney(1_000L);
    JavaMoney money2  = money1;
    JavaMoney money3  = new JavaMoney(1_000L);
    
    System.out.println(money1 == money2);
    System.out.println(money1 == money3);
    System.out.println(money1.equals(money3));
    
    System.out.println(money1.plus(money3));
  }

}
