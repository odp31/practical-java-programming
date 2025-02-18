// ex 3.18a date and time 

import java.util.*;
public class DateExample {
  public static void main(String[] args) throws InterruptedException {
    Date date = new Date();
    System.out.println("current date and time is: "  + date.toString());
    long tm = date.GetTime();
    System.out.println("current time in milliseconds; " + tm);
  }
}

