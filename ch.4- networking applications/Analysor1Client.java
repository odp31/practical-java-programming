// ex 5.17d; analysor1client.java RMI client program

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class Analysor1Client {
  public static void main(String[] args) {
    double d[] = new double[10];
    for(int i = 0; i < d.length; i++) {
      d[i] = i;
    }
    try {
      Analysor1 c = (Analysor1) Naming.lookup("rmi://localhost:1099/AnalysorService");
      System.out.println("average of array d: "  + c.Average(d));
    }
    catch(MalformedURLExcpetion murle) {
      System.out.println();
      System.out.println("malformed URL excpetion");
      System.out.println(murle);
    }
    catch(RemoteExcpetion re) {
      System.out.println();
      System.out.println("remoteException);
      System.out.println(re);
    }
    catch(NotBoundException nbe) {
      System.out.println();
      System.out.println("notBoundException");
      System.out.println(nbe);
    }
    catch(java.lang.ArithmeticException e) {
      System.out.println();
      System.out.println("java.lang.ArithmeticExcpetion");
      System.out.println(ae);
    }
  }
}
