// ex. 3.14A object oriented programming example
class Math1
  private int z;          // encapsulation
  public void setZ(int x) {    // setter method
    z=x;
}
public int getZ() {          // getter method
  return z;
}
}
class Oop1 {
  public static void main(String[] args) {
    Math m = new Math1();    // instantiation (Math1: class m: object)
    m.setZ(5);                // call setter method
    System.out.println(m.getZ());      // call getter method 
  }
}
