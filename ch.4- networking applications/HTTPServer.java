// ex. 5.13; HTTP server

import java.io.*;
import java.net.*;

public class HTTPServer {
  protected void start() {
    ServerSocket s;
    System.out.println("starting up HTTP server");
    try {
      s = new ServerSocket(8088);
    } catch (Exception e) {
      System.out.println("Error: " + e);
      return;
    }
    System.out.println("waiting...");
    for(;;) {
      try {
        Socket remote = s.accept();
        System.out.println("connected...");
        BufferedReader in = new BufferedReader(new InputStreamReader(remote.getInputStream()));
        PrintWriter out = new PrintWriter(remote.getOutputStream());
        String str = ".";
        while (!str.equals("")) {
          str = in.readLine();
          System.out.println(str);
        }
        out.println("HTTP/1.1 200 OK");
        out.println("Content-Type: text/html");
        out.println("Server: Java HTTP Server");
        out.println("");
        out.println("<H1>Hello World! </H1>");
        out.flush();
        remote.close();
      } catch (Exception e) {
        System.out.println("Error: " + e);
      }
    }
  }
  public static void main(String args[]) {
    HTTPServer sr = new HTTPServer();
    sr.start();
  }
}
