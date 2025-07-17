package Atm.example;

import javax.swing.*;
import java.awt.*;

public class withdrawMoney extends JFrame {
    public withdrawMoney() {
        this.setTitle("Withdraw Money");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.green);
        this.setResizable(false);
        this.setLayout(new FlowLayout());

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.lightGray);
        Panel.setPreferredSize(new Dimension(400, 100));
        JLabel AmountLabel = new JLabel("Enter Amount");
        JTextField AmountField = new JTextField();
        AmountField.setPreferredSize(new Dimension(150, 30));
        Panel.add(AmountLabel);
        Panel.add(AmountField);
        this.add(Panel);

        JPanel Panel2 = new JPanel();
        Panel2.setBackground(Color.lightGray);
        Panel2.setPreferredSize(new Dimension(400, 50));
        JLabel PinLabel = new JLabel("Enter Pin");
        JTextField PinField = new JTextField();
        PinField.setPreferredSize(new Dimension(150, 30));
        Panel2.add(PinLabel);
        Panel2.add(PinField);
        this.add(Panel2);

        JPanel Panel3 = new JPanel();
        Panel3.setBackground(Color.lightGray);
        Panel3.setPreferredSize(new Dimension(400, 100));
        JButton withdrawMoneyButton = new JButton("Withdraw");
        withdrawMoneyButton.setBackground(Color.cyan);
        withdrawMoneyButton.setPreferredSize(new Dimension(150, 30));
        withdrawMoneyButton.addActionListener(e ->{
            JOptionPane.showMessageDialog(new JFrame(),"Amount withdrawn is:"+AmountField.getText());
             this.dispose();
             new Home();
        });
        Panel3.add(withdrawMoneyButton);
        this.add(Panel3);

        this.setVisible(true);


    }
}
