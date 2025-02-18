// ex 8.2b; single neuron example with training

public class Neuron2Demo {
  public static void main(String[] args) {
    double x[][] = {{0,0},{0,1},{1,0},{1,1}};
    int y[] = {0,1,1,1};
    Neuron2 n = new Neuron2();
    n.Train(x, y, 0.2, 0.5, 1000);

    System.out.println(n.Output(new double[] {0,0}));
    System.out.println(n.Output(new double[] {0,1}));
    System.out.println(n.Output(new double[] {1,0}));
    System.out.println(n.Output(new double[] {1, 1}));
  }
}
