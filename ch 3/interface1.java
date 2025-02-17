// ex.3.15 using an interface in object-oriented programming
interface Animal {
  public void speak();
}

class Dog implements Animal {
  public void speak() {
    System.out.println("Woof! Woof!");
  }
  public static void main(String args[]) {
    Dog p = new Dog();
    p.speak();
  }
}
