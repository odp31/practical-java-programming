// ex 3.21 Sleep or Delay example

public class SleepExample2 {
  public static void main(String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();
    Thread.sleep(2000);
    System.out.println("sleep time in ms = " + (System.currentTimeMillis() - start));
  }
}
