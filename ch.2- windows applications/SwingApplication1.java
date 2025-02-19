// ex 4.1; java swing 

import javax.swing.*;

public class SwingApplication1 extends JFrame {
  public SwingApplication1() {
    super("hello world swing application");
  }
  private static void createAndShowGUI() {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new SwingApplication1();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable()){
      public void run() {
        createAndShowGUI();
      }
    });
  }
}
