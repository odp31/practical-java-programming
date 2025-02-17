// x. 3.17C thread priority example 
public class ThreadPriority1 extends Thread{
  String message;
  ThreadPriority1 (String message) {
    this.message = message;
  }
  public void run() {
    System.out.println(message);
  }
  public static void main(String[] args) {
    ThreadPriority1 ht1 = new ThreadPriority1("Thread 1...");
    ThreadPriority1 ht2 = new ThreadPriority1("Thread 2...");
    ThreadPriority1 ht3 = new ThreadPriority1("Thread 3...");
    ThreadPriority1 ht4 = new ThreadPriority1("Thead 4...");
    ThreadPriority1 ht5 = new ThreadPriority1("Thread 5...");
    ht1.setPriority(2);
    ht2.setPriority(4);
    ht3.setPriority(6);
    ht4.setPriority(8);
    ht5.setPriority(10);

    ht1.start();
    ht2.start();
    ht3.start();
    ht4.start();
    ht5.start();
  }
}
