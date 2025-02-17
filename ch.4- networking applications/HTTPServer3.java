// ex. 5.14B; multithreaded HTTP file server 

import java.io.*;
import java.net.*;

public class HTTPServer3 {
  public static void main(String[] args) {
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
        System.out.println("accepted client: " + client);
        HTTPServer3Thread s = new HTTPServer3Thread(client);
        s.start();
      }
      catch(Exception e) {
        System.out.println("Error: " + e);
        return;
      }
    }
  }
}
class HTTPServer3Thread extends Thread {
  Socket client;
  HTTPServer3Thread(Socket client) {
    this.client = client;
  }
  public void run() {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
      PrintWriter out = new PrintWriter(client.getOutputStream());
      String reqMeth = "";
      String reqURL = "";
      String reqProto = "";
      String str = ".";
      int i = 0;
      while(!str.equals("")) {
        str = in.readLine();
        System.out.println(i + ": " + str);
        if (i == 0) {
          reqMeth = str.substring(0, 3);
          reqURL = str.substring(5, (str.lastIndexOf("HTTP/1.")));
          reqProto = str.substring(str.indexOf("HTTP/1."));
        }
        i++;
      }
      // send HTTP header
      out.println("HTTP/1.1 200 OK");
      out.println("content-type: text/html");
      out.println("server: java HTTP server");
      out.println("");
      // open file and send out line by line
      FileReader file = new FileReader(reqURL.trim());
      BufferedReader filebuff = new BufferedReader(file);
      boolean endof = false; 
      String line;
      while (!endof) {
        line = filebuff.readLine();
        if(line == null) {
          endof=true;
          break;
        out.println(line);
        }
        file.close();

        // close all streams
        out.flush();
        out.close();
        client.close();
      } catch (Exception e) {
        System.out.println("Error: " + e);
    }
  }
}
          
