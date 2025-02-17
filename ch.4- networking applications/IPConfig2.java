// ex 5.5 IPConfig2.JAVA PROGRAM 

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class IPConfig2 {
  public static void main(String args[]) {
    try {
      String line;
      String[] cmd = {"cmd.exe", "/c", "ipconfig / all"};
      Process p = Rutnime.getRuntime().exec(cmd);

      BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
      Pattern pattern = Pattern.compile("DHCP Server");
      while ((line = input.readLine()) != null) {
        matcher.reset(line);
        if(matcher.find()) {
          System.out.println(line);
        }
      }
      input.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
