// ex 3.19A: simple timer program
import java.util.*;
import java.awt.Toolkit;

public class Timer1 {
  long t1, t2;
  Toolkit toolkit;
  Timer timer;
  public Timer1() {
    t1 = System.currentTimeMillis();
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new RemindTask(), 0, 1*1000);
  }
  class RemindTask extends TimerTask {
    int i = 0;
    public void run() {
      if (i < 5) {
        toolkit.beep();
        t2 = System.currentTimeMillis();
        t2 = (t2 - t1);
        System.out.println(i + ": " + t2 * 0.001+" s");
        i++;
      }
      else {
        System.out.println(new GregorianCalendar().getTime());
        System.exit(0);
      }
    }
  }
  public static void main(String[] args) {
    new Timer1();
  }
}
