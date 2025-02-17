// ex. 5.8a; multithreaded echo server

import java.io.*;
import java.net.*;

public class EchoServer2 {
  public static void main(String[] args) {
    ServerSocket echoServer;
    int id = 0;
    try {
      echoServer = new ServerSocket(9999);
      while(true) {
        Socket clientSocket = echoServer.accept();
        ChatThread cliThread = new ChatThread(clientSocket, id++);
        cliThread.start();
      }
    }
    catch(IOException e) {
      System.out.println(e);
    }
  }
}
class ChatThread extends Thread {
  Socket clientSocket;
  int id;

  BufferedReader br;
  PrintWriter os;
  String line;

  ChatThread(Socket clientSocket, int id) {
    this.clientSocket = clientSocket;
    this.id = id;
  }
  public void run() {
    try {
      br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      os = new PrintWriter(clientSocket.getOutputStream(), true);
      while((line = br.readLine()) != null) {
        System.out.println(id + "-received; " + line);
        os.println(line);
      }
    }
    catch(IOException e) {
      System.out.println(e);
    }
    finally {
      try{
        br.close();
        os.close();
        clientSocket.close();
        System.out.println(id + "... stopped");
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println(message);
  }
}
