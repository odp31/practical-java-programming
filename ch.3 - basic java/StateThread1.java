//3.17a multithreaded programming example

class StateThread1 extends Thread {
  public void run() {
    System.out.println("this is a thread...");
  }
  public static void main(String[] args) {
    StateThread st1 = new StateThread1();
    System.out.println("thread before start():" + st1.getState());
    st1.start();
    System.out.println("thread after start():" + st1.getState());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("thread after is: " + st1.getState());
  }
}
