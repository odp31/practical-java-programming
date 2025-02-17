// ex. 5.15; SMTP example

import java.io.*;
import java.net.*;

public class smtpClient {
  public static void main(String[] args) {
    Socket smtpSocket = null;
    DataOutputStream os = null;

    BufferedReader br = null;
    String client = "Olivia Polos";
    String server = "www.gmail.com";
    String sender = "olivia.polos0731@gmail.com";
    String receiver = "odp6@njit.edu";
    try {
      smtpSocket = new Socket(server, 25);
      os = new DataOutputStream(smtpSocket.getOutputStream());
      br = new BufferedReader(new InputStreamReader(smtpSocket.getInputStream()));
    }
    catch (UnknownHostException e) {
      System.err.println("don't know about host: " + server);
    } catch (IOException e) {
      System.err.println("couldn't get I/O for the connection to: hostname");
    }
    if(smtpSocket != null && os != null && br != null) {
      try {
        os.writeBytes("HELO " + client + "\n");
        os.writeBytes("MAIL From: " + sender + "\n");
        os.writeBytes("RCPT To: " + receiver + "\n");
        os.writeBytes("DATA\n");
        os.writeBytes("From: " + sender + "\n");
        os.writeBytes("Subject: testing\n");
        os.writeBytes("Hi tehre 1\n");
        os.writeBytes("\n.\n");
        os.writeBytes("QUIT\n")

        String responseLine;
        while((responseLine = br.readLine()) != null) {
          System.out.println("Server: " + responseLine);
          if(responseLine.indexOf("Ok") != -1) {
            break;
          }
        }
        os.close();
        smtpSocket.close();
      } catch(UnknownHostExcpetion e) {
        System.err.println("trying to connect to unknown host: " + e);
      } catch(IOException e) {
        System.err.println("IOException: " + e);
      }
    }
  }
}
