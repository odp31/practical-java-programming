// ex. 3.2 Java standard output and input
public class InputOutputExample {
  public static void main(String[] args) {
    System.out.println("enter something: ");
    String x = System.console().readLine();
    System.out.println("You wrote: " + x);
  }
}
