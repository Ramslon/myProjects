package Atm.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LogIn extends JFrame {
    public LogIn() {
        this.setTitle("LOG-IN");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.getContentPane().setBackground(Color.GRAY);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel Panel = new JPanel();
        Panel.setLayout(new FlowLayout());
        Panel.setBackground(Color.gray);
        Panel.setPreferredSize(new Dimension(400, 100));
        JLabel userNameLabel = new JLabel("UserName");
        userNameLabel.setBounds(10,20,80,25);
        JTextField userNameText = new JTextField(8);
        userNameText.setBounds(100,20,100,25);
        Panel.add(userNameLabel);
        Panel.add(userNameText);
        this.add(Panel);

        JPanel Panel1 = new JPanel();
        Panel1.setLayout(new FlowLayout());
        Panel1.setBackground(Color.gray);
        Panel.setPreferredSize(new Dimension(400, 100));
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,20,80,25);
        JPasswordField passwordText = new JPasswordField(8);
        passwordText.setBounds(100,20,100,25);
        Panel1.add(passwordLabel);
        Panel1.add(passwordText);
        this.add(Panel1);

        /*JPanel Panel3 = new JPanel();
        Panel3.setLayout(new FlowLayout());
        Panel3.setPreferredSize(new Dimension(400, 100));
        JLabel ConfirmPasswordLabel = new JLabel("Confirm Password");
        ConfirmPasswordLabel.setBounds(10,20,80,25);
        JPasswordField ConfirmPasswordText = new JPasswordField();
        ConfirmPasswordText.setBounds(100,20,100,25);
        Panel3.add(ConfirmPasswordLabel);
        Panel3.add(ConfirmPasswordText);
        this.add(Panel3);*/

        JPanel Panel2 = new JPanel();
        Panel2.setLayout(new FlowLayout());
        Panel2.setPreferredSize(new Dimension(400, 100));
        JButton LogInButton = new JButton("LOG IN");
        LogInButton.setBackground(Color.CYAN);
        LogInButton.addActionListener(e ->{
            if(e.getSource() == LogInButton) {
                this.dispose();
                new Home();
            }
        });
        Panel2.add(LogInButton);
        this.add(Panel2);


        this.setVisible(true);
    }
}
