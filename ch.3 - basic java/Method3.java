//ex 3.13; method example

class Method3 {
  public static void main(String[] args) {
    double x = 3,y = 5;
    double s = add(x,y);
    System.out.println("sum of x and y is: " + s);
  }
  // add() method
  private static double add(double x, double y) {
    return x + y;
  }
}
