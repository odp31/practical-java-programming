// ex 3.16b; multithreaded programming with 3 threads
public class HelloThread1 extends Thread{
  String message;
  // pass message into thread
  HelloThread1 (String message) {this.message = message; }
  public void run() {
    System.out.println(message);
  }
  public static void main(String[] args) {
    HelloThread ht1 = new HelloThread1("thread 1...");
    HelloThread ht2 = new HelloThread1("thread 2...");
    HelloThread ht3 = new HelloThread1("thread 3...");
    ht1.start();
    ht2.start();
    ht3.start();
  }
}
