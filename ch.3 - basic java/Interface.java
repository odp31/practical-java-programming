// ex 3.15a; using an interface in Oop

interface Animal {
  public void speak () {
    System.out.println("woof!woof!");
  }
  public static void main(String args[]){
    Dog p = new Dog();
    p.speak();
  }
}
