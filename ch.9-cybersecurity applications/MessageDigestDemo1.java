//ex 9.3; java message digest
import java.security.MessageDigest;

public class MessageDigestDemo1 {
  public static void main(String[] args) throws Exception {
    String stringToEncrypt = "hello world";
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.update(stringToEncrypt.getBytes());
    String encryptedString = new String(messageDigest.digest());
    System.out.println("original text:" + stringToEncrypt);
    System.out.println("message digest: " + encryptedString);
  }
}
