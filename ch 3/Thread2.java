// ex. 3.16H multithread programming example 
public class Thread2 {
  public static void main(String args[]) {
    Runnable calc = new CalcThread();
    Thread thread1 = new Thread(calc, "calculation1");
    thread1.start();
  }
}
class CalcThread implements Runnable {
  // execute the thread
  public void run() {
    int num, sum = 0;
    System.err.println("started!");
    num = (int) (Math.random() * 100);
    for(int i = 0; i < num; i++) {
      sum += i;
    }
    System.err.println("sum (0 to "+num+"): " + sum);
    System.err.println("done!");
  }
}
