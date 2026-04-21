package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swingex {

  static void main() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);

    JLabel label = new JLabel("Hello, Swing!");
    JTextField textField = new JTextField("Enter text here");

    //buttons
    JButton button = new JButton("Submit");
    JButton button1 = new JButton("Submit");
    JButton button2 = new JButton("Submit");

    JPanel panel = new JPanel();
    panel.add(label);
    panel.add(textField);
    panel.add(button);
    panel.add(button1);
    panel.add(button2);


    frame.add(label);
    frame.add(panel);
    frame.setVisible(true);
    frame.show();

  }

}
