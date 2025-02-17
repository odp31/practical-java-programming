// ex. 5.6a; udpserver1.java program

import java.net.*;

class UDPServer1 {
  public static void main(String argv[] throws Exception {
    byte[] buf = new byte[256];
    String strData; 
    int PORT = 3301;
    DatagramSocket serverSocket = new DatagramSocket(PORT);
    DatagramPacket packet = new DatagramPacket(buf, buf.length);

    serverSocket.receive(packet);
    strData = new String(packet.getDate());
    InetAddress IPAddress = packet.getAddress();
    PORT = packet.getPort();
    System.out.println("datagram received; " + IPAddress + ":" + PORT);

    buf = strData.getBytes();
    packet = new DatagramPacket(buf, buf.length, IPAddress, PORT);
    serverSocket.send(packet);
    serverSocket.close();
  }
}
