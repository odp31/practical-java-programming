// ex 3.16c; multithred programming example using runnable interface

public class HelloThread2 implements Runnable {
  String message;
  HelloThread2(String message){
    this.message = message;
  }
  public void run() {
    System.out.println(message);
  }
  public static void main(String[] args) {
    HelloThread2 ht1 = new HelloThread2("Thread 1...");
    HelloThread2 ht2 = new HelloThread2("Thread 2...");
    HelloThread2 ht3 = new HelloThread2("Thread 3...");
    Thread t1 = new Thread(ht1);
    Thread t2 = new Thread(ht2);
    Thread t3 = new Thread(ht3);
    t1.start();
    t2.start();
    t3.start();
  }
}
