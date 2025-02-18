// ex 3.12 method example
public class Method2 {
  public void pupAge() {
    int age = 0;
    age = age+7;
    System.out.println("puppy age is: " + age);
  }
  public static void main(String args[]) {
    Method2 test = new Method2();
    test.pupAge();
  }
}
