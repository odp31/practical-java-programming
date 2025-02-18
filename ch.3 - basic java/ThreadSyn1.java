// ex 3.17d; thread synchronization example

class Test {
  void printMessage(String txt) {
    for(int i = 1; i <= 5; i++) {
      System.out.println(txt);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class ThreadSyn1 extends Thread {
  String message;
  Test t;
  ThreadSyn1(Test t, String message){
    this.t = t;
    this.message = message;
  }
  public void run() {
    t.printMessage(message);
  }
  public static void main(String args[]) {
    Test m = new Test();
    ThreadSyn1 t1 = ThreadSyn1(m, "A");
    ThreadSyn1 t2 = new ThreadSyn1(m, "B");
    t1.start();
    t2.start();
  }
}
