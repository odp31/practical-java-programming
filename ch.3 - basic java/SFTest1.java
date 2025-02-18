// ex 3.24b; sftest1

import java.text.*;
import biz.biox.SpecialFunctions;

class SFTest1 {
  public static void main(String args[]) {
    double x;
    SpecialFunctions sf = new SpecialFunctions();
    System.out.println("number \t Erf \t Erfc \t ExpErfc");
    for(int i = 0; i < 10; i++) {
      x = (i - 5) / 10.0;
      System.out.println(x + "\t " + sf.erf(x) + "\t" + sf.erfc(x) + "\t" + sf.ExpErfc(x));
    }
  }
}
