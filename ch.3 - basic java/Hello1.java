//ex 3.6; using if else
class Hello1 {
  public static void main(String[] args) {
    if(args.length != 2) {
      System.out.println("usage; java Hello1 firstname surname!");
    } else{
      System.out.println("hello"+ args[0] + " " + args[1] + "!");
    }
  }
}
