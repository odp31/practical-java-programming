// ex 3.15b; oop using an anonymous inner class
interface Animal {
  public void speak();
}

class Dog2 {
  public static void main(String args[]){
    // anon inner class
    new Animal(){
      public void speak() {
        System.out.println("Woof! woof!");
      }
    }.speak();
  }
}
