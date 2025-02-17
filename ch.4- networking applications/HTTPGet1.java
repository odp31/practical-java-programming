// ex. 5.10; Httpget1.java 

import java.io.*;
import java.net.*;

public class HTTPGet1 {
  // HTTP GET request
  public static void getHTML(String website) throws Exception {
    URL url = new URL(website);
    HttpURLConnnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("User-Agent", "Chrome/51.0.2704.63);
    conn.setRequestProperty("Accept-Language", "en-US, en");
    int responseCode = conn.getResponseCode();
    System.out.println("\nSending 'GET' request to URL: " + website);
    Sytem.out.println("response code: " + responseCode);
    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    StringBuilder response = new StringBuilder();
    String line;
    while ((line = br.readLine()) != null) {
      response.append(line);
    }
    br.close();
    System.out.println(response.toString());
  }
  public static void main(String[] args) throws Exception {
    getHTML("https://docs.oracle.com/javase/tutorial/");
  }
}
