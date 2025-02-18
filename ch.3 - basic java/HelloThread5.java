//ex 3.16f; multithreaded programming example

public class HelloThread5 {
  public static void main(String[] args) {
    Hello5 ht1 = new Hello5("Thread 1...");
    Hello5 ht2 = new Hello5("Thread 2...");
    Hello5 ht3 = new Hello5("Thread 3...");

    ht1.start();
    ht2.start();
    ht3.start();
  }
}
class Hello5 extends Thread {
  String message;
  Hello5(String message){
    this.message = message;
  }
  public void run() {
    System.out.println(message);
  }
}
