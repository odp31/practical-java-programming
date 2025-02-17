// multithreaded HTTP server

import java.io.*;
import java.net.*;

public class HTTPServer2 {
  public static void main(String args[]) {
    int port = 8088;
    ServerSocket web;
    try {
      web = new ServerSocket(port);
    } catch (Exception e) {
      System.out.println("Error: " + e);
      return;
    }
    while(true) {
      System.out.println("multithreaded web server running on port: " + port);
      try {
        Socket client = web.accept();
        System.out.println("Accepted client :" + client);
        HTTPServer2Thread s = new HTTPServer2Thread(client);
        s.start();
      }
      catch(Exception e) {
        System.out.println("error: " + e);
        return;
      }
    }
  }
}
class HTTPServer2Thread extends Thread {
  Socket client;
  HTTPServer2Thread(Socket client) {
    this.client = client;
  }
  public void run() {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
      PrintWriter out = new PrintWriter(client.getOutputStream());
      String str = ".";
      while(!str.equals("")) {
        str = in.readLine();
        System.out.println(str);
      }
      out.println("HTTP/1.1 200 OK");
      out.println("content-type: text/html");
      out.println("server: java HTTP server");
      out.println("");
      // send HTML page
      out.println("<H1>Hello Multithreaded HTTP Server!</H1>");
      out.flush();
      out.close();
      client.close();
    } catch(Exception e) {
      System.out.println("Error: " + e);
    }
  }
}
