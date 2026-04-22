package Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {

  public static void addComponents(JPanel panel) {
    JLabel label = new JLabel("Enter Username:");
    JTextField textField = new JTextField();
    JLabel label1 = new JLabel("Enter Password:");
    JPasswordField passwordField = new JPasswordField();

    //buttons
    JButton cancelButton = new JButton("Cancel");
    JButton loginButton = new JButton("Login");
    //addong components to panel
    panel.add(label);
    panel.add(textField);
    panel.add(label1);
    panel.add(passwordField);
    panel.add(cancelButton);
    panel.add(loginButton);

    //adding action to buttons
    loginButton.addActionListener(new  ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String username = textField.getText();
        String password = new String(passwordField.getPassword());
        if (checkData(username, password)) {
          System.out.println("Login successful!");
        } else {
          System.out.println("Invalid username or password.");
        }
      }}
    );
  }

  static void main() {
    JFrame frame = new JFrame("Login Form");
    JPanel panel = new JPanel(new GridLayout(3, 2,15,15));
    addComponents(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.add(panel);
    frame.getContentPane().add(panel);
    frame.setVisible(true);
    frame.show();
  }
public static boolean checkData(String username, String password) {
    if (username.equals("Java") || password.equals("123")) {
      return true;
    }
    return false;
}
}
