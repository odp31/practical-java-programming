// ex. 5.1; netaddress1.jaa program
import java.net.InetAddress;

class NetAddress1 {
  public static void main(String args[]) throws Exception {
    InetAddress inetAddress = InetAddress.getLocalHost();
    System.out.println("IP Address: " + inetAddress.getHostAddress());
    System.out.println("host name: " + inetAddress.getHostName());
  }
}
