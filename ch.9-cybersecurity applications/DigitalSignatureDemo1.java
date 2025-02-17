//ex 9.5; java digital signature

import java.security.*;
public class DigitalSignatureDemo1 {
  public static void main(String[] args) throws Exception {
    String m = "hello world";
    Signature signature = Signature.getInstance("SHA256WithDSA");
    SecureRandom secureRandom = new SecureRandom();
    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
    //initialize digital signature
    signature.initSign(keyPair.getPrivate(), secureRandom);
    byte[] data = m.getBytes("UTF-8");
    signature.update(data);
    byte[] digitalSignature= signature.sign();
    System.out.println("create digital signature: " + digitalSignature.toString());
    Signature signature2 = Signature.getInstance("SHA256WithDSA");
    byte[] data2 = m.getBytes("UTF-8");
    signature2.update(data);
    boolean verified = signature2.verify(digitalSignature);
    System.out.println("signature verifies:" + verified);
  }
}
