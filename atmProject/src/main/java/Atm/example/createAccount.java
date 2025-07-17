package Atm.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createAccount extends JFrame {

    public createAccount() {
        this.setTitle("Create Account");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.getContentPane().setBackground(Color.green);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);





        JPanel Panel = new JPanel();
        Panel.setBackground(Color.gray);
        Panel.setPreferredSize(new Dimension(500, 50));
        JLabel FirstNameLabel = new JLabel("First Name");
        JTextField FirstNameField = new JTextField();
        FirstNameField.setPreferredSize(new Dimension(150, 30));
        Panel.add(FirstNameLabel);
        Panel.add(FirstNameField);
        this.add(Panel);

      JPanel Panel2 = new JPanel();
      Panel2.setBackground(Color.gray);
      Panel2.setPreferredSize(new Dimension(500, 50));
      JLabel SecondNameLabel = new JLabel("Second Name");
      JTextField SecondNameField = new JTextField();
      SecondNameField.setPreferredSize(new Dimension(150, 30));
      Panel2.add(SecondNameLabel);
      Panel2.add(SecondNameField);
      this.add(Panel2);

      JPanel Panel3 = new JPanel();
      Panel3.setBackground(Color.gray);
      Panel3.setPreferredSize(new Dimension(500, 50));
      JLabel PinLabel = new JLabel("Pin");
      JTextField PinField = new JTextField();
      PinField.setPreferredSize(new Dimension(150, 30));
      Panel3.add(PinLabel);
      Panel3.add(PinField);
      this.add(Panel3);

      JPanel Panel4 = new JPanel();
      Panel4.setBackground(Color.gray);
      Panel4.setPreferredSize(new Dimension(500, 50));
      JLabel PhoneNoLabel = new JLabel("PhoneNO");
      JTextField PhoneNoField = new JTextField();
      PhoneNoField.setPreferredSize(new Dimension(150, 30));
      Panel4.add(PhoneNoLabel);
      Panel4.add(PhoneNoField);
      this.add(Panel4);

      JPanel Panel5 = new JPanel();
      Panel5.setBackground(Color.gray);
      Panel5.setPreferredSize(new Dimension(500, 50));
      JButton CreateAccountButton = new JButton("Create Account");
      CreateAccountButton.setBackground(Color.CYAN);
      CreateAccountButton.setPreferredSize(new Dimension(150, 30));
      CreateAccountButton.addActionListener(e ->{
        if(e.getSource() == CreateAccountButton) {
          this.dispose();
         new LogIn();
        }
      });
      Panel5.add(CreateAccountButton);
      this.add(Panel5);




      this.setVisible(true);


    }

  }


