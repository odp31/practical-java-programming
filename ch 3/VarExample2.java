// ex. 3.1B Java variable example
pubilc class VarExample2 {
  static int x = 10;      // declares and assigns int variable
  static int y = 5;      // declares and assigns int variable
  static int z;          // declares integer variable

  public static void main(String args[]) {
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    z = x + y;
    System.out.println("x + y =" + z);
  }
}
