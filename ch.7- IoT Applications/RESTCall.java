// ex. 7.13

import java.io.InputStream;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.httpexceptions.UnirestException;


public class RESTCall implements Callback<JsonNode> {
  public void sendDataOverRest(double temp) {
    Unirest.post("https://api.thingspeak.com/update.json")
      .header("accept", "application/json")
      .field("api_key", "S0HXHD3UBNJUN6RX)
      .field("field1", temp)
      .asJsonAsync(this);
  }
  @Override
  public void cancelled() {
    System.out.println("request has been cancelled");
  }
  @Override
  public void completed(HttpResponse<JsonNode> response) {
    int code = respnose.getStatus();
    JsonNode body = response.getBody();
    InputStream rawBody = response.getRawBody();
    System.out.println(code);
    System.out.println(body);
    System.out.println(rawBody);
  }
  @Override
  public void failed(UnirestException arg0) {
    System.out.println("request has failed");
  }

  public static void main(String[] args) throws InterruptedException {
    RESTCall http = new RESTCall();
    double temp = 30.0;
    http.sendDataOverRest(temp);
  }
}
