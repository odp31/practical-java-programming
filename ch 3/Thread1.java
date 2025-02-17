// ex 3.16G: multithreaded programming using calculations
public class Thread1 {
  public static void main(String args[]) {
    CalcThread thread1, thread2;
    thread1 = new CalcThread("calculation 1");
    thread2 = new CalcThread("calculation 2");
    thread1.start();
    thread2.start();
  }
}
class CalcThread extends Thread {
  private int num, sum = 0; 
  public CalcThread(String name) {
    super(name);
    // generate random number between 0 and 100
    num = (int)(Math.random() * 100);
  }
  // execute thread
  public void run() {
    System.err.println(getName() + " started!");
    for(int i = 0; i < num; i++) {
      sum += i;
    }
    System.err.println(getName() + ": sum (0 to "+num+"): " + sum);
    System.err.println(getName() + " done!");
  }
}
