// ex. 5.7b

import java.io.*;
import java.net.*;
class TCPClient1 {
  public static void main(String argv[]) throws Exception {
    Socket clientSocket = null;
    int PORT = 3301; 
    String HOST = "localhost";

    BufferedReader inputLine = new BufferedReader(new InputStreamReader(System.in));
    clientSocket = new Socket(HOST, PORT);
    System.out.println("connected to: " + clientSocket.getInetAddress() + ":" + clientSocket.getPort());
    DataOutputStream outputLine = new DataOutputStream(clientSocket.getOutputStream());
    BufferedReader replyLine = new BufferedReader(new InputStreamReader(clientSocket.getInputSTream()));
    outputLine.writeBytes(inputLine.readLine() + '\n');
    System.out.println("FROM SERVER: " + replyLine.readLine().toUpperCase());
    clientSocket.close();
  }
}
