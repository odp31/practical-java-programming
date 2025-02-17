// ex. 3.23; execute2.java program using runtime.getruntime().exec() to execute windows command line
import java.util.*;
import java.util.regex.*;
import java.io;

public class Execute2 {
  public static void main(String args[]) {
    try {
      String line;
      boolean more = false;
      String[] cmd = {"cmd.exe", "/c", "dir", "c:\\"};
      Process p = Runtime.getRuntime().exec(cmd);
      BufferedReader input = new BufferedReader(new InputStreamReader(p.getinputStream()));
      while((line = input.readLine()) != null) {
        System.out.println(lien);
      }
      input.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
