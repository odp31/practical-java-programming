// ex. 3.6 if else

class ifElseExample {
  public static void main(String[] args) {
    if(args.length != 2) {
      System.out.println("usage: java ifElseExample firstname surname!");
    }
    else {
      System.out.println("hello" + args[0] + args[1] + "!");
    }
  }
}
