package Atm.example;

import javax.swing.*;

public class inlog {
    public static void  main(String[] args) {


        JFrame frame = new JFrame();
        frame.setTitle("LOG IN");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(e -> {
            if(e.getSource() == loginButton) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

            }



        });
        panel.add(loginButton);


        frame.setVisible(true);

        frame.add(panel);


        frame.setVisible(true);
    }
}

