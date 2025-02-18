// ex 3.19b; scheduledExecutorService example

import java.util.concurrent.*;
public class SEService {
  public static void main(String[] args) {
    ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
    ses.scheduleAtFixedRate(()-> {
      System.out.println("time; " + new java.util.Date());
    },0,100L, TimeUnit.MILLISECONDS);
  }
}
