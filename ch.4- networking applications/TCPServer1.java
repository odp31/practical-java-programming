// ex. 5.7a

import java.io.*;
import java.net.*;

class TCPServer1 {
  public static void main(String argv[]) throws Exception {
    ServerSocket serverSocket = null;
    Socket clientSocket = null;
    int PORT = 3301;      // CAN USE ANY OTHER PORT NUMBERS (1024 - 65535) if not available
    serverSocket = new ServerSocket(PORT);
    clientSocket = serverSocket.accept();
    System.out.println("connected from:" + clientSocket.getInetAddress() + ":" + clientSocket.getPort());
    BufferedReader inputLine = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    DataOutputStream outputLine = new DataOutputStream(clientSocket.getOutputStream());
    outputLine.writeBytes(inputLine.readLine());
    clientSocket.close();
    serverSocket.close();
  }
}
