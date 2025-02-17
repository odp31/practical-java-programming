// ex. 5.4; ipconfig1.ava program

import java.io.*;

public class IPConfig1 {
  public static void main(String args[]) {
    try {
      String line;
      String[] cmd = {"cmd.exe", "/c", "ipconfig / all"};
      Process p = Rutnime.getRuntime().exec(cmd);
      BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
      whle ((line = input.readLine()) != null) {
        System.out.println(line);
      }
      input.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
