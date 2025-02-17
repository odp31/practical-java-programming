// ex. 3.17B multithread programming example
public class StateThread2 extends Thread {
  public void run() {
    System.out.println("this is a thread...");
    try {
      Thread.sleep(5000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    StateThread2 st = new StateThread2();
    System.out.println("thread before start():" + st.getState());
    st.start();
    System.out.println("thread after start():" + st.getState());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("thread after 1s: " + st.getState());
  }
}
