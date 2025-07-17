package Atm.example;

import javax.swing.*;
import java.awt.*;

public class checkBalance extends JFrame {
    checkBalance() {
        this.setTitle("Check Balance");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(400, 400);
        this.getContentPane().setBackground(Color.gray);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.green);
        Panel.setPreferredSize(new Dimension(400, 100));
        JLabel AmountLabel = new JLabel("Enter Amount");
        JTextField AmountField = new JTextField();
        AmountField.setPreferredSize(new Dimension(150, 30));
        Panel.add(AmountLabel);
        Panel.add(AmountField);
        this.add(Panel);

        JPanel Panel2 = new JPanel();
        Panel2.setBackground(Color.green);
        Panel2.setPreferredSize(new Dimension(400, 50));
        JLabel PinLabel = new JLabel("Enter Pin");
        JTextField PinField = new JTextField();
        PinField.setPreferredSize(new Dimension(150, 30));
        Panel2.add(PinLabel);
        Panel2.add(PinField);
        this.add(Panel2);



        JPanel Panel3 = new JPanel();
        Panel3.setBackground(Color.green);
        Panel3.setPreferredSize(new Dimension(400, 100));
        JButton checkBalanceButton = new JButton("Ok");
        checkBalanceButton.setBackground(Color.CYAN);
        checkBalanceButton.setPreferredSize(new Dimension(150, 30));
        checkBalanceButton.addActionListener(e ->{
            JOptionPane.showMessageDialog(new JFrame(),"Your Balance is "+AmountField.getText());
            this.dispose();
            new Home();
        });
        Panel3.add(checkBalanceButton);
        this.add(Panel3);

        this.setVisible(true);
    }
}
