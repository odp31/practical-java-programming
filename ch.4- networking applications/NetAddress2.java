// ex. 5.3 netAddress2.java program

import java.net.*;
import java.util.*;

public class NetAddress2 {
  public static void main(String[] args) {
    try {
      System.out.println("getLocalHost: " + InetAddress.getLocalHost().toString());
      System.out.println("all addresses for local host: ");
      InetAddress[] addr = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
      for(InetAddress a: addr) {
        System.out.println(a.toString());
      }
    }
    catch(UnknownHostException _e) {
      _e.printStackTrace();
    }
    try {
      Enumeration<NetworkInterface> ni = nicEnum.nextElement();
      System.out.println("name: " + ni.getDisplayName());
      System.out.println("name: : + ni.getName());
      Enumeration<InetAddress>addrEnum = ni.getInetAddresses();
      while(addrEnum.hasMoreElements())
        {
          InetAddress ia = addrEnum.nextElement();
          System.out.println(ia.getHostAddress());
        }
    }
  
  catch(SocketException _e) {
    _e.printStackTrace();
  }
  }
  
  
