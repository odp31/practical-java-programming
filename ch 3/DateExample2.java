// ex. 3.18B date and time using localdatetime() class

import java.time.LocalDateTime;    // import localdate time class
import java.time.format.DateTimeFormatter;

public class DateExample2 {
  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.now();
    System.out.println("year: " + dt.getYear());
    System.out.println("month: " + dt.getMonth());
    System.out.println("day: " + dt.getDayOfMonth());
    System.out.println("day of the week: " + dt.getDayOfWeek());
    System.out.println("unformatted: " + dt);
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    System.out.println("formatted: " + dt.format(f));
  }
}
