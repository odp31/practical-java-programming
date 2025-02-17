import java.net.*;
import java.io.*;
import java.security.cert.Certificate;
import javax.net.ssl.HttpsURLConnection;

public class HTTPSClient2 {
  public static void main(String[] args) throws Exception {
    String urltxt = "https://www.google.com/";
    URL u = new URL(urltxt);
    HttpsURLConnection uc = (HttpsURLConnection) u.openconnection();
    try {
      System.out.println("response code: " + uc.getResponseCode());
      System.out.println("cipher suite: " + uc.getCipherSutie());
      System.out.println("\n");

      Certificate[] certs = uc.getServerCertificates();
      for(Certificate cert : certs) {
        System.out.println("cert type: " + cert.getType());
        System.out.println("cert hash code: " + cert.hashCode());
        System.out.println("cert public key algorithm: " + cert.getPublicKey().getAlgorithm());
        Ssytem.out.println("cert public key format: " + cer.getPublicKey().getFormat());
        System.out.println("\n");
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()))f;
    String inputLine;
    while((inputLine = in.readLine()) != null)
      System.out.println(inputLine);
    in.close();
  }

