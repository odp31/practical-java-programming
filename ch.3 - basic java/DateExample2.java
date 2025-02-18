// ex 3.18b; date and time

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class DateExample2 {
  public static void main(String[] args){
    LocalDateTime dt = LocalDateTime.now();
    System.out.println("Year: " + dt.getYear());
    System.out.println("Month: : + dt.getMonth());
    System.out.println("Day: " + dt.getDayOfMonth());
    System.out.println("Day of the week: " + dt.getDayOfWeek());
    System.out.println("unformatted: " + dt);

    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    System.out.println("formatted: " + dt.format(f));
  }
}
