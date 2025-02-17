//ex 9.1; private key encryption - pg. 330

import java.security.*;
import javax.crypto.*;

public class PrivateKeyDemo1{
  static String algorithm = "AES";
  static Key key;
  static Cipher cipher;
  public static void main(String[] args) throws Exception{
    key = KeyGenerator.getInstance(algorithm).generateKey();
    cipher = Cipher.getInstance(algorithm);
    String text = "hello world";
    byte[] encryptionBytes = encrypt(text);
    
