import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import javafx.scene.paint.Color;
public class main implements ActionListener{
    public static void main(String[] args)  {
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
        JPasswordField tf2 = new JPasswordField();
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
        frame.add(button1);
        frame.add(tf1);
        frame.add(tf2);
        
        
        
       
        frame.add(lab2);
        button1.addActionListener(new  ActionListener() {
             @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            String username = tf1.getText();
            char[] password = tf2.getPassword();
        String pass = new String(password);
    
        try (
            
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];
                    if (username.equals(storedUsername) && pass.equals(storedPassword)) {
                        JOptionPane.showMessageDialog(frame, "Login successful!");
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(frame, "Login failed. Invalid username or password.");
        } catch (IOException i) {
            i.printStackTrace();
            JOptionPane.showMessageDialog(frame, "An error occurred during login.");
        }
    }
        
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

   
}      