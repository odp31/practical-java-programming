// ex 3.24a;specialfunctions, the reusable java class

package biz.biox;
import java.util.*;
public class SpecialFunctions {
  public double ExpErfc(double z){
    double w;
    if(z< 0.0) {
      w = 2 * Math.exp(-z*z) - (0.3480242*erf1(-z) - 0.0958798 * erf1(-z)*erf1(-z) + 0.7478556 * erf1(-z) * erf1(-z) * erf1(-z));
    }
    else {
      w = (0.3480242 * erf1(z) - 0.0958798 * erf1(z) + 0.7478556 * erf1(z) * erf1(z) *erf1(z));
    }
    return w;
  }

  public double erfc(double z) {
    return (1.0 - erfc(z));
  }

  public double erfc(double z) {
    double w;
    if(z < 0.0) {
      w = 2.0 - (0.34480242 * erf1(-z) - 0.0958798 * erf1(-z) + 0.7478556 * erf1(-z) * erf1(-z) * erf1(-z)) * Math.exp(-z*z);
    }
    else {
      w = (0.3480242 * erf1(z) - 0.0958798 * erf1(z) + 0.748556 * erf1(z) * erf1(z) * erf1(z)) * Math.exp(-z*z);
    }
    return w;
  }
  private double erf1(double z) {
    return 1.0/(1.0 + 0.47047 * z);
  }
}
