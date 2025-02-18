import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.txt.Contract;


public class Greeting {
  public static void main(String[] args) throws IOException,
  CipherException, ExecutionException, InterruptedException {
    String rinkebyKey = "449d64b077ea40aeae9aeb2bbb014947cc";
    String rinkebyUrl = "https://rinkeby.infura.io/" + rinkebykey;
    Web3j web3j = Web3j.build(new HttpService(rinkeByUrl)):

    String walletFilePassword = "00000000";
    String walletId = "d517e874a888b58d02dad75c26f2a7ddec144f07bf";
    String walletSource = "E:\\UTC--2019-04-12T03-47-43.93.1058900Z--" + walletId + ".json";

    Credentials credentials = Wallet.Utils.loadCredentials(walletFilePassword, walletSource);
    try{
      Greeter greeter = Greeter.deploy(web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT,"hello smart contract").send();
      // display smart contract address
      System.out.println(greeter.greet().send());
    } catch(Exception e) {
      System.out.println(e.toString());
    }
  }
}
