//ex.9.4; java message digest 2

import java.security.MessageDigest;
public class MessageDigestDemo2{
  public static void main(String[] args) throws Exception {
    String stringToEncrypt = "hello world";
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    byte[] encodedhash = messageDigest(stringToEncrypt.getBytes());
    String encryptedString = bytesToHex(encodedHash);
    System.out.println("original text: " + stringToEncrypt);
    System.out.println("message digest: " + encryptedString);
  }
  private static String bytesToHex(byte[] hash) {
    StringBuffer hexString = new StringBuffer();
    for(int i = 0; i < hash.length; i++){
      String hex = Integer.toHexString(0xff & hash[i]);
      if(hex.length() == 1) hexString.append('0');
        hexString.append(hex);
    }
    return hexString.toString();
  }
}
