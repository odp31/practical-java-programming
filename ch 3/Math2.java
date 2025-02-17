// ex. 3.14B object oriented programming example
class Math2
  public int w;    // public variable
  public Math2() {      // constructor variable
  }
  public double add(double x, double y) {
    return x + y;
  }
  public int add(int x, int y) {    // method overloading
    return x + y;
  }
}
class Oop2 {
  public static void main(String[] args) {
    Math2 m = new Math2();
    System.out.println(m.add(3,2));          // call add method
    System.out.println(m.add(4.0,2.1));      // call add method
    System.out.println(m.W);                // get public variable W
  }
}
