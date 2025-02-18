import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.txt.TransactionManager;
import org.web3j.txt.gas.ContractGasProvider;

public class Greeter extends Contract {
  private static final String BINARY = "6080604053345920359023525893025903285209385209";
  public static final String FUNC_KILL = "kill";
  public static final String FUNC_GREET = "greet";

  @Deprecated
  protected Greeter(String contractAddress, Web3j web3j,Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }
  protected Greeter(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGastProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }
  @Deprecated
  protected Greeter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit){
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit) 
  }
  protected Greeter(String contractAddress, Web3j web3j,TransactionManager transactionManager,ContractGasProvider contractGasProvider) {
    super(BINARY,contractAddress,web3j, transactionManager, contractGasProvider);
  }
  public RemoteCall<TransactionReceipt> kill() {
    final Function function = new Function(
      FUNC_KILL,
      Arrays.<Type>.asList(),
      Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }
  public RemoteCall<String> greet() {
    final Function function = new Function(FUNC_GREET, 
      Arrays.<Type>asList(),
      Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>(){}));
    return executeRemoteCallSingleValueReturn(function, String.class);
  }
  @Deprecated
  public static Greeter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice,BigInteger gasLimit) {
    return new Greeter(contractAddress, web3j, credentials, gasPrice,gasLimit);
  }
  @Deprecated
  public static Greeter load(String contractAddress, Web3j web3j, TransactionManager transactionManager,BigInteger gasPrice, BigInteger gasLimit) {
    return new Greeter(contractAddress, web3j, transactionManager,gasPrice, gasLimit);
  }
  public static Greeter load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return new Greeter(contractAddress, web3j, credentials, contractGasProvider);
  }
  public static Greeter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return new Greeter(contractAddress, web3j,transactionManager, contractGasProvider);
  }
  public static RemoteCall<Greeter> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _greeting)
  {
    String encodedConstructor= FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.webj.abi.datatypes.Utf8String(_greeting)));
    return deployRemoteCall(Greeter.class,web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
  }
  public static RemoteCall<Greeter> deploy(Web3j web3j, TransactionManager transactionManager,ContractGasProvider contractGasProvider,String _greeting) {
    String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_greeting)));
    return deployRemoteCall(Greeter.class, web3j, transactionManager, contractGasProvider,BINARY, encodedConstructor);
  }
  @Deprecated
  public static RemoteCall<Greeter> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _greeting){
    String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_greeting)));
    return deployRemoteCall(Greeter.class, web3j, credentials, gasPrice, gasLimit,BINARY, encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<Greeter> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,String _greeting) {
    String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_greeting)));
    return deployRemoteCall(Greeter.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
  }
}
