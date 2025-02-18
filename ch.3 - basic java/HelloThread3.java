// ex 3.16d; multithread programming example using an anonymous inner class

public class HelloThread3 {
  public static void main(String[] args){
    new Thread(new Runnable() {
      public void run() {
        System.out.println("Thread...");
      }
    }).start();
  }
}
