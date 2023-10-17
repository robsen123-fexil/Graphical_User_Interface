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
        
       
}}