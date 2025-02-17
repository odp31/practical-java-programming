// ex. 3.18A date and time example
import java.util.*;
public class DateExample {
  public static void main(String[] args) throws InterruptedException {
    // get current date and time
    Date date = new Date();
    System.out.println("current date and time is " + date.toString());
    // get current time
    long tm = date.getTime();
    System.out.println("current time is" + tm);
  }
}
