// ex. 5.16B JavaMail API POP3 example

import java.util.*;
import javax.mail.*;

public class JavaMail2 {
  public static void main(String[] args) {
    String host = "pop.gmail.com";
    String username = "yourname@gmail.com";
    String password = "yourpassword";

    try {
      // create properties field
      Properties properties = new Properties();
      properties.put("mail.pop3.host", host);
      properties.put("mail.pop3.port", "995");
      properties.put("mail.pop3.starttls.enable", "true");
      Session emailSession = Session.getDefaultInstance(properties);

      // create pop3 store object and connect with pop server
      Store store = emailSession.getStore("pop3s");
      store.connect(host, username, password);

      // create folder object and open it
      Folder emailFolder = store.getFoler("INBOX");
      emailFolder.open(Folder.READ_ONLY);

      // retrieve messages from folder in an array and print it
      Message[] message = emailFolder.getMessages();

      for(int i = 0; n = messages.length; i < n; i++) {
        Message message = messages[i];
        System.out.println("---------------------");
        System.out.println("Email Number " + (i + 1));
        System.out.println("Subject: " + message.getSubject()));
        System.out.println("From: " + message.getFrom()[0]);
        System.out.println("Text: " + message.getContent().toString());
      }
      // close store and folder objects
      emailFolder.close(false);
      store.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
