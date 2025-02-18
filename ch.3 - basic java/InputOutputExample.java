// ex 3.2; java standard output and input using system.console
public class InputOutputExample {
  public static void main(String[] args) {
    System.out.print("enter something:");
    String x = System.console().readLine();
    System.out.println("you wrote:" + x);
  }
}
