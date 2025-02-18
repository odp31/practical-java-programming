// ex 8.5;  tensorFlow java example

import org.tensorflow.TensorFlow;

public class TensorFlowExample {
  public static void main(String[] args) {
    final String value = "Hello from " + TensorFlow.version();
    System.out.println(value);
  }
}
