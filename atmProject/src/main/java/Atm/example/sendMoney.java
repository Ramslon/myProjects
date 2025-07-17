package Atm.example;

import javax.swing.*;
import java.awt.*;

public class sendMoney extends JFrame {
    public sendMoney() {
        this.setTitle("Send Money");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 350);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.darkGray);
        this.setResizable(false);
        this.setLayout(new FlowLayout());

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.lightGray);
        Panel.setPreferredSize(new Dimension(400, 100));
        JLabel PhoneNoLabel = new JLabel("Enter Phone NO");
        JTextField PhoneNoField = new JTextField();
        PhoneNoField.setPreferredSize(new Dimension(150, 30));
        Panel.add(PhoneNoLabel);
        Panel.add(PhoneNoField);
        this.add(Panel);

        JPanel Panel2 = new JPanel();
        Panel2.setBackground(Color.lightGray);
        Panel.setPreferredSize(new Dimension(400, 100));
        JLabel AmountLabel = new JLabel("Enter Amount");
        JTextField AmountField = new JTextField();
        AmountField.setPreferredSize(new Dimension(150, 30));
        Panel2.add(AmountLabel);
        Panel2.add(AmountField);
        this.add(Panel2);

        JPanel Panel3 = new JPanel();
        Panel3.setBackground(Color.lightGray);
        Panel3.setPreferredSize(new Dimension(400, 100));
        JButton sendMoneyButton = new JButton("Send");
        sendMoneyButton.setBackground(Color.CYAN);
        sendMoneyButton.setPreferredSize(new Dimension(150, 30));
        sendMoneyButton.addActionListener(e ->{
            JOptionPane.showMessageDialog(new JFrame(),"Amount send to:"+PhoneNoField.getText()  +AmountField.getText());
            this.dispose();
            new Home();
        });
        Panel3.add(sendMoneyButton);
        this.add(Panel3);

        this.setVisible(true);

    }
}
