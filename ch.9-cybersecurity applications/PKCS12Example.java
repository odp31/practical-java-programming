import java.io.FileInputStream;
import java.security.*;
import java.security.cert.Certificate;

public class PKCS12Example {
  public static void main(String[] argv) throws Exception {
    String storefile = "keystore.pfx";
    String alias = "LSBU";
    String storepass = "storepassword";

    FileInputStream is= new FileInputStream(storefile);
    KeyStore keystore = KeyStore.getInstance("PKCS12");
    keystore.load(is, storepass.toCharArray());

    Key key = keystore.getKey(alias,storepass.toCharArray());
    if(key instanceof PrivateKey) {
      //get certificate of publickey
      Certificate cert = keystore.getCertificate(alias);
      System.out.println(cer.toString());
      // get public key
      PublicKey publicKey = cert.getPublicKey();
      System.out.println(publicKey.toString());
      // return a key pair
      KeyPair kp = new KeyPair(publicKey,(PrivateKey) key);
      System.out.println(kp.toString());
    }
  }
}
