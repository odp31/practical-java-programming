// ex 4.3; java swing example with label and text field
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingApplication2 extends JFrame implements ActionListener 
  {
    private JLabel label;
    private JTextField tf;
    private JButton button;
    public SwingApplication2() {
      super("java swing with label");
      setLayout(new FlowLayout());
      tf = new JTextField(20);
      add(tf);
      button = new JButton("equals");
      button.addActionListener(this);
      add(button);
      label = new JLabel("this is a swing label");
      add(label);
    }
    private static void createAndShowGUI() {
      JFrame frame = new SwingApplication2();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
      float s;
      if(e.getSource() == button) {
        s = Float.parseFloat(tf.getText());
        s = s*s;
        label.setText("square of" + tf.getText() + " is " + s);
      }
    }
  }
