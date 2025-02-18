//ex 3.16e;object oriented multithreaded programming

public class HelloThread4 {
  public static void main(String[] args) {
    Hello4 ht1 = new Hello4("Thread 1...");
    Hello4 ht2 = new Hello4("Thread 2...");
    Hello4 ht3 = new Hello4("Thread 3...");

    Thread t1 = new Thread(ht1);
    Thread t2 = new Thread(ht2);
    Thread t3 = new Thread(ht3);

    t1.start();
    t2.start();
    t3.start();
  }
}
class Hello4 implements Runnable {
  String message;
  Hello4(String message) {
    this.message = message;
  }
  public void run() {
    System.out.println(message);
  }
}
