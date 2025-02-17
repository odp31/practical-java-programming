// ex. 5.2; netInfo.java program
import java.net.*;

class NetInfo {
  public static void main(String args[]) throws Exception {
    // get ip address
    InetAddress ip;
    ip = InetAddress.getLocalHost();
    System.out.pritnln("ip address: " + ip.getHostAddress());
    NetworkInterface network = NetworkInterface.getByInetAddress(ip);
    // get subnet mask
    InetAddress localHost = Inet4Address.getLocalHost();
    NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
    System.out.println("subnet mask: " + networkInterface.getInterfaceAddresses().get(0).getNetworkPrefixLength());
    // get mac address
    byte[] mac = network.getHardwareAddress();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < mac.length; i++) {
      sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
    }
    System.out.println("mac address: " + sb.toString());
  }
}
