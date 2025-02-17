// ex 3.3 java standard output and input
import java.util.Scanner;

class InputOutputExample2 {
  public static void main(String[] args) {
    System.out.println("enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("your name is: " + name);
    int age = scanner.nextInt();
    System.out.println("your age is: " + age);
  }
}
