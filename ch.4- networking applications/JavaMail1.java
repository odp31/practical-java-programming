// ex 5.16; javamail API example

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class JavaMail1 {
  public static void main(String[] args) {
    final String username = "olivia.polos0731@gmail.com";
    final String password = "password";
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
      }
    });
    try {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("olivia.polos0731@gmail.com));
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("someone@somewhere.com"));
      message.setSubject("your research paper");
      message.setText("dear perry,");
      Transport.send(message);
      System.out.println("Done");
    } catch (MessagingException e) {
      throw new RuntimeException(e);
    }
  }
}
