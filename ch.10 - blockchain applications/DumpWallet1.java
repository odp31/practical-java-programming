//ex 10.3; dumpwallet1.java

import org.bitcoinj.wallet.Wallet;

public class DumpWallet1 {
  public static void main(String[] args) throws Exception {
    String walletfile = "/path/to/walletfile";
    File f = new File(walletfile);
    Wallet wallet = Wallet.loadFromFile(f);
    System.out.println(wallet.toString());
  }
}
