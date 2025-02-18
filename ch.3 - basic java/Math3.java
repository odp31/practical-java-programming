// ex 3.14C; inheritance in object oriented programming

class Math3 {
  public Math3() {
  }
  public double func(double x) {
    return Math.cos(x);
  }
}
class Math3a extends Math3 {
  public double func(double x) {
    return Math.sin(x);
  }
  public double toDegree(double x) {
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
