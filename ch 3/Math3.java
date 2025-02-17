// ex.3.14C object oriented programming example
class Math3 {      // parent class
  public Math3() {
  }
  public double func(double x) {
    return Math.cos(x);
  }
}
class Math3a extends Math3 {      // sub-class, inheritance
  public double func(double x) {    // method overriding
    return Math.sin(x);
  }
  public double toDegree(double x) {    // create a new method in sub-class
    return Math.toDegrees(x);
  }
}
class Oop3 {
  public static void main(String[] args) {
    Math3 m = new Math3();
    Math3a n = new Math3a();
    System.out.println(m.func(0.0));
    System.out.println(n.func(0.0));
    System.out.println(n.toDegree(3.14));
  }
}
