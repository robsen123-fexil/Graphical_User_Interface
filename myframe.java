import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myframe {
      JFrame frame ;
      JButton  button;
      JPanel panel;
      JLabel lab1;
      JLabel lab2;
      JPasswordField pass ;
      JTextField tf1; 
 public myframe(){
      frame = new JFrame("e-commerce");
      frame.setSize(400, 300);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      button = new JButton("login");
      button.setBounds(140, 150, 100, 30);
       tf1 = new JTextField();
      tf1.setBounds(140, 70, 100, 30);
      JPasswordField pass = new JPasswordField();
      pass.setBounds(140,110,100,30);
      JLabel lab1 = new JLabel("USERNAME");
      lab1.setBounds(65, 75, 100, 30);
      frame.add(lab1);
      JLabel lab2 = new JLabel("password");
        lab2.setBounds(70,105,100,30);
        frame.add(button);
        frame.add(tf1);
        frame.add(pass);
        JLabel label1 = new JLabel("WELCOME ");
        Font labelFont = new Font("Arial", Font.BOLD, 20); // Example: Font.BOLD for bold style
        label1.setFont(labelFont);
       
        JPanel panel1 = new JPanel();
        frame.add(panel1, BorderLayout.NORTH);
        panel1.add(label1);
        frame.add(panel1);
        
        
        
       
        frame.add(lab2);
      
}
}

