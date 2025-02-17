// ex. 5.8B

import java.io.*;
import java.net.*;

public class EchoClient {
  public static void main(String[] args) {
    Socket echoSocket;
    PrintWriter out;
    BufferedReader in;
    try {
      echoSocket = new Socket("localhost", 9999);
      out = new PrintWriter(echoSocket.getOutputStream(), true);
      in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
      BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

      String userInput;
      while ((userInput = stdIn.readLine()) != null) {
        out.println(userInput);
        System.out.println("echo: " + in.readLine());
      }
      out.close();
      in.close();
      stdIn.close();
      echoSocket.close();
    }
    catch(Exception e) {
      System.out.println("error: " + e.toString());
      System.exit(-1);
    }
  }
}
