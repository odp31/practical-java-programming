//ex. 8.1b; java perceptron (single neuron) demo example

import java.util.Random;

public class Neuron1Demo{
  public static void main(String[] args){
    double x[] = {1.4, -0.33};
    double w[] = {new Random().nextDouble(),new Random().nextDouble()};
    Neuron1 n = new Neuron1(x,w);
    System.out.println(x[0]);
    System.out.println(x[1]);
    System.out.println(n.Output());
  }
}
