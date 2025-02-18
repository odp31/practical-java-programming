//ex 10.2E

import java.util.*;

public class BlockChainMain5 {
  public static ArrayList<Block2> blockchain= new ArrayList<Block2>();
  public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
  public static int difficulty = 5;

  public static void main(String[] args) {
    Wallet A = new Wallet(blockchain);
    Wallet B = new Wallet(blockchain);
    System.out.println("wallet A balance:" + A.getBalance());
    System.out.println("Wallet b balance:" + B.getBalance());
    System.out.println("add two transactions...");
    Transaction trans1 = A.send(B.publicKey,10);
    if(tran1 != null) {
      transactions.add(tran1);
    }
    Transaction tran2 = A.send(B.publickKey,20);
    if(tran2 != null) {
      transactions.add(tran2);
    }
    Block2 b = new Block2(0,null,transactions);
    b.mineBlick(difficulty);
    blockchain.add(b);

    System.out.println("wallet a balance:" + A.getBalance());
    System.out.println("wallet b balance:" + B.getBalance());
    System.out.println("blockchain valid: " + validateChain(blockchain));
  }
  public static boolean validateChain(ArrayList<Block2> blockchain){
    if(!validateBlock(blockchain.get(0), null){
      return false;
    }
    for(int i = 1; i < blockchain.size();i++){
      Block2 currentBlock = blockchain.get(i);
      Block2 previousBlock = blockchain.get(i - 1);
      if(!validateBlock(currentBlock,previousBlock){
        return false;
      }
    }
    return true;
  }
  public static boolean validateBlock(Block2 newBlock, Block2 previousBlock) {
    // same as before 
  }
}
