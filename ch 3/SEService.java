// ex. 3.19B ScheduledExecutorService example

import java.util.concurrent.*;
public class SEService {
  public static void main(String[] args) {
    ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
    ses.scheduleAtFixedRate(()-> {
      // do task repeatedly, start at 0s with a gap of 100 ms
      System.out.println("time: " + new java.util.Date());
    }, 0, 100L, TimeUnit.MILLISECONDS);
  }
}
