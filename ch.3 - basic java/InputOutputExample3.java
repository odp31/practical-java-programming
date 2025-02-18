// ex 3.4; java standard output and input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputExample3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("enter string");
    String s = br.readLine();
    System.out.println("enter integer");
    try {
      int i = Integer.parseInt(br.readLine());
    } catch(NumberFormatException nfe) {
      System.err.println("invalid format");
    }
  }
}
