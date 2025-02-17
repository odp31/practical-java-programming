//ex 8.5; tensorflow 

import org.tensorflow.Tensorflow;

public class TensorFlowExample {
  public static void main(String[] args) {
    final String value = "Hello from " + TensorFlow.version();
    System.out.println(value);
  }
}
