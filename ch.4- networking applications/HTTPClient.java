// ex. 5.9A HTTP client

import java.net.*;
import java.io.*;

public class HTTPClient {
  public static void main(String[] args) throws Exception {
    URL u = new URL("http://www.google.com/");
    URLConnection uc = u.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamREader(uc.getInputStream()));
    String inputLine;
    while ((inputLine = in.readLine()) != null)
      System.out.println(inputLine);
    in.close();
  }
}
