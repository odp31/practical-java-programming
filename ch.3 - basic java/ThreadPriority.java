// ex 3.17c; thread priority example

public class ThreadPriority1 extends Thread {
  String message;
  ThreadPriority1 (String message) {
    this.message = message;
  }
  public void run() {
    System.out.println(message);
  }
  public static void main(String[] args) {
    ThreadPriority1 ht1 = new ThreadPriority1("Thread 1...");
    ThreadPriority ht2 = new ThreadPriority1("Thread 2...");
    ThreadPriority ht3 = new ThreadPriority1("Thread 3...");
    ThreadPriority ht4 = new ThreadPriority1("Thread 4...");
    ThreadPriority ht5 = new ThreadPriority1("Thread 5...");
    ht1.setPriority(2);
    ht2.setPriority(4);
    ht3.setPriority(6);
    ht4.setPriority(10);
    
    ht1.start();
    ht2.start();
    ht3.start();
    ht4.start();
    ht5.start();
  }
}
