// ex. 5.11 HTTPPost1.java
import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

public class HTTPPost1 {
  private static void postHTML(String website, String urlParameters) throws Exception {
    URL url = new URL(website);
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
    conn.setRequestMethod("POST");
    conn.setRequestProperty("user-agent", "chrome/51.0.2704.63");
    conn.setRequestProperty("accept-language", "en-US,en");
    conn.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();
    int responseCode = conn.getResponseCode();
    System.out.println("\nSending 'POST' request to URL: " + website);
    System.out.println("post parameters: " + urlParameters);
    System.out.println("response code: " + responseCode);
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();
    System.out.println(response.toString().substring(0,1000));
  }
  public static void main(String[] args) throws Exception {
    String website = "https://www.amazon.co.uk/s/ref=nb_sb_noss_2?";
    String urlParameters = "url=search-alias%3Daps&field-keywords=java";
    String website = "https://www.google.co.uk/search?";
    String urlParameters = "q=java";
    postHTML(website, urlParameters);
  }
}
