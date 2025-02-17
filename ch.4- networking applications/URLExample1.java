import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

public class HTTPPost1 {
  private static void postHTML(String website, String urlParameters) throws Exception {
    URL url = new URL(website);
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
    conn.setRequestMethod("POST");
    conn.setRequestProperty("User-Agent", "Chrome/51.0.2704.63");
    conn.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();

    int responseCode = conn.getResponseCode();
    System.out.println("\nSending 'POST' request to URL: " + website);
    System.out.println("Post parameters: " + urlParameters);

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
    String website = "https://www.amazon.co.uk/s/ref=nb_sb_noss_2?";    // search java in amazon
    String urlParameters = "url=search-alias%3Daps&field-keywords=java";
    postHTML(website, urlParameters);
  }
}
