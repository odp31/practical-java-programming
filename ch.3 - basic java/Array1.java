// ex 3.7; array example
import java.util.*;

class Array1 {
  public static void main(String[] args) {
    int[] x;
    double [][] y;
    int i, j, row, col;
    if(args.length != 2) {
      System.out.println("usage:java array1 row colume");
      System.exit(0);
    }
    // initialize arrays
    row = Integer.parseInt(args[0]);
    col = Integer.parseInt(args[1]);
    x = new int[row];
    y = new double[row][col];
    for(i = 0; i < row; i++) {
      x[i] = i;
    }
    for(i = 0; i < row; i++){
      for(j = 0; j < col; j++) {
        y[i][j] = Math.random();
      }
    }
    // display arrays
    System.out.print("x[]=");
    for(i = 0; i < row; i++) {
      System.out.print(x[i] + "\t");
    }
    System.out.println();
    System.out.println("y[][] = ");
    for(i = 0; i < row; i++) {
      for(j = 0; j < col; j++) {
        System.out.print(y[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
