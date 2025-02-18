// ex 3.19c; using a scheduledExecutorService with a count variable

import java.util.concurrent.*;

public class SEService2 {
  private static int count = 0;
  public static void main(String[] args) {
    ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
    Runnable task1 = () -> {
      System.out.println("running task1" + count);
      count++;
    }
    ses.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);
    ses.schedule(task1, 5, TimeUnit.SECONDS);
    ses.shutdown();
  }
}
