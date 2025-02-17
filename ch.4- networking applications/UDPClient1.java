// ex. 5.6B; UDPclient1.ajva 

import java.io.*;
import java.net.*;
class UDPClient1 {
  public static void main(String argv[]) throws Exception {
    int PORT = 3301;
    String HOST = "localhost";
    String strData;

    System.out.println("please enter your text:");
    BufferedReader inputLine = new BufferedReader(new InputStreamReader(System.in));
    new BufferedReader(new InputStreamReader(System.in));

    DatagramSocket clientSocket = new DatagramSocket();
    InetAddress IPAddress = InetAddress.getByName(HOST);
    byte[] buf = new byte[256];
    strData = inputLine.readLine();
    buf = strData.getBytes();

    DatagramPacket packet = new DatagramPacket(buf, buf.length, IPAddress, PORT);
    clientSocket.send(packet);

    packet = new DatagramPacket(buf, buf.length);
    clientSocket.receive(packet);
    strData = new String(packet.getData());
    System.out.println("from server: " + strData.toUpperCase());
    clientSocket.close();
  }
}
