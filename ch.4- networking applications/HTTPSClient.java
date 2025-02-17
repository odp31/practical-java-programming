// ex. 5.9B; HTTPS client

import java.net.*;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;

public class HTTPSClient {
  public static void main(String[] args) throws Exception {
    URL u = new URL ("https://www.google.com/");
    HttpsURLConnection uc = (HttpsURLConnection) u.openConection();
    BufferedReader in = new BufferedReader(new InputStreamREader(uc.getInputSTream()));

    String inputLine;

    while((inputLine = in.readLine()) != null)
      System.out.println(inputLine);
    in.close();
  }
  
