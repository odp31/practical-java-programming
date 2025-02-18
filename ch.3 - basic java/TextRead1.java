//ex 3.10; textread to read data from a text file

import java.io.*;
class TextRead1 {
  public static void main(String[] args) {
    String filename = "";
    if(args.length==1){
      filename=args[0];
    }
    else{
      System.out.println("usage: Java TextRead1 Filename.txt");
      System.exit(0);
    }
    try {
      FileReader file = new FileReader(filename);
      BufferedReader filebuff = newBufferedReader(file);
      boolean endof = false;
      String line;
      while (!endof){
        line = filebuff.readLine();
        if(line == null){
          endof = true;
          break;
        }
        System.out.println(line);
      }
      file.close();
    }
    catch(IOException e) {
      System.err.println("error -- " + e.toString());
    }
  }
}
