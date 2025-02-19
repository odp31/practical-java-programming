// ex 4.2; java swing example with label and text field

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingApplication2 extends JFrame implements ActionListener {
  private JLabel label;
  private JTextField tf;

  public SwingApplication2() {
    super("java swing with label");
    setLayout(new FlowLayout());
    label = new JLabel("this is a swing label");
    add(label);

    tf = new JTextField(20);
    tf.addActionListener(this);
    add(tf);
  }
  private static void createAndShowGUI() {
    Jframe frame = new SwingApplication2();
    frame.setDefualtCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
  public void actionPerformed(ActionEvent e) {
    label.setText(tf.getText());
  }
}
