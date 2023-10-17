import java.awt.*;
import javax.swing.*;

import javafx.scene.paint.Color;
public class main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("shoping");
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label1 = new JLabel("WELCOME ");
        Font labelFont = new Font("Arial", Font.BOLD, 20); // Example: Font.BOLD for bold style
        label1.setFont(labelFont);
       
        JPanel panel1 = new JPanel();
        frame.add(panel1, BorderLayout.NORTH);
        panel1.add(label1);
        panel1.setBackground(java.awt.Color.GRAY);
        JButton button1 = new JButton("login");
        button1.setBounds(140, 150, 100, 30);
        frame.add(button1);
        JTextField tf1 = new JTextField();
        tf1.setBounds(140, 70, 100, 30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(140,110,100,30);
        frame.add(tf1);
        frame.add(tf2);
        frame.setResizable(true);
        JLabel lab1 = new JLabel("Email/phone");
        //lab1.setFont(new Font("arial", Font.ITALIC, 10));
        lab1.setBounds(65, 75, 100, 30);
        frame.add(lab1);
        JLabel lab2 = new JLabel("password");
        lab2.setBounds(70,105,100,30);
        frame.add(lab2);
    }
}      