// ex 3.14B; method overloading in object-oriented programming

class Math2 {
  public int w;

  public Math2() {  //constructor method
  }
  public double add(double x, double y) {
    return x + y;
  }
  public double add(int x, int y) {      // method overloading
    return x + y;
  }
}
class Oop2 {
  public static void main(String[] args) {
    Math2 m = new Math2();
    System.out.println(m.add(3,2));
    System.out.println(m.add(4.0,2.1));
    System.out.println(m.W);
  }
}
