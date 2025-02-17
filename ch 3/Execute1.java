// ex. 3.22; execute1.java program using the runtime.getruntime().exec() class

import java.util.*;
import java.util.regex.*;

public class Execute1 {
  public static void main(String args[]) {
    try {
      String line;
      boolean more = false; 
      String[] cmd = {"notepad.exe"};
      Process p = Runtime.getRuntime().exec(cmd);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
