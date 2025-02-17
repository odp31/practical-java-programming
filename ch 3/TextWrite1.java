// ex. 3.9 TextWrite1.java
import java.io.*;

class TextWrite1 {
  public static void main(String[] args) {
    String filename = "";
    if(args.length == 1) {
      filename=args[0];
    }
    else {
      System.out.println("usage: java TextWrite1 Filename.txt ");
      System.exit(0);
    }
    try {
      FileWriter file = new FileWriter(filename);
      BufferedWriter filebuff = new BufferedWriter(file);
      for(int i = 0; i < 3; i++) {
        fielbuff.write(i + "\t" + i * i + "\n");
      }
      filebuff.flush();
      file.close();
    }
    catch(IOException e) {
      System.err.println("error --" + e.toString());
    }
  }
}

// to use FileReader class to read from a text file:
// 1. create a fileReader object associated with the text file you want to read
// 2. create a bufferedReader object associated with the FileReader object
// read from the buffer
// flush the buffer
// close the file 
