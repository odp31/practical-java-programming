// ex 3.14A; object oriented programming 
class Math1 {
  private int z;
  public void setZ(int x) {
    z = x;
  }
  public int getZ() {
    return z;
  }
}
class Oop1 {
  public static void main(String[] args){
    Math m = new Math1();
    m.setZ(5);
    System.out.println(m.getZ());
  }
}
