//ex 10.1 c; blockcahinmain2

public class BlockChainMain2 {
  public static ArrayList<Block> blockchain = new ArrayList<Block>();
  public static int difficulty = 5;

  public static void main(String[] args) {
    Block b = new Block(0, null, "my first block");
    b.mineBlock(difficulty);
    blockchain.add(b);
    System.out.println(b.toString());
    System.out.println("current block valid: " + validatesBlock(b, null));

    Block b2 = new Block(1, b.currentHash, "My second block");
    b2.mineBlock(difficulty);
    blockchain.add(b2);
    b2.data= " my third block";
    Ssytem.out.println(b2.toString());
    System.out.println("current block valid:" + validateBlock(b2,b));
  }
  public static boolean validateBlock(Block newBlock, Block previousBlock) {
    if(previousBlock == null) {
      if(newBlock.index!= 0) {
        return false;
      }
      if(newBlock.previousHash != null) {
        return false;
      }
      if(newBlock.currentHash == null|| !newBlock.calculateHash().equals(newBlock.currentHash)) {
        return false;
      }
      return true;
    } else{
      if(newBlock != null) {
        if(previousBlock.index + 1 != newBlock.index) {
          return false;
        }
        if(newBlock != null) {
          if(previousBlock.index + 1 != newBlock.index) {
            return false;
          }
          if(newBlock.previousHash == null|| !newBlock.previousHash.equals(previousBlock.currentHash)){
            return false;
          }
          if(newBlock.currentHash == null || !newBlock.calculateHash().equals(newBlock.currentHash)) {
            return false;
          }
          return true;
        }
        return false;
      }
    }
  }
