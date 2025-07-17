package Atm.example;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
        this.setTitle("Home");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.green);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.darkGray);
        Panel.setPreferredSize(new Dimension(500, 100));
        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.setPreferredSize(new Dimension(150, 30));
        checkBalanceButton.addActionListener(e ->{
            this.dispose();
            new checkBalance();

        });
        Panel.add(checkBalanceButton);
        this.add(Panel);

        JPanel Panel2 = new JPanel();
        Panel2.setBackground(Color.darkGray);
        Panel2.setPreferredSize(new Dimension(500, 100));
        JButton depositButton = new JButton("Deposit");
        depositButton.setPreferredSize(new Dimension(150, 30));
        depositButton.addActionListener(e ->{
            this.dispose();
            new deposit();
        });
        Panel2.add(depositButton);
        this.add(Panel2);

        JPanel Panel3 = new JPanel();
        Panel3.setBackground(Color.darkGray);
        Panel3.setPreferredSize(new Dimension(500, 100));
        JButton sendMoneyButton = new JButton("Send Money");
        sendMoneyButton.setPreferredSize(new Dimension(150, 30));
        sendMoneyButton.addActionListener(e ->{
            this.dispose();
            new sendMoney();

        });
        Panel3.add(sendMoneyButton);
        this.add(Panel3);

        JPanel Panel4 = new JPanel();
        Panel4.setBackground(Color.darkGray);
        Panel4.setPreferredSize(new Dimension(500, 100));
        JButton withdrawMoneyButton = new JButton("Withdraw Money");
        withdrawMoneyButton.setPreferredSize(new Dimension(150, 30));
        withdrawMoneyButton.addActionListener(e ->{
            this.dispose();
            new withdrawMoney();

        });
        Panel4.add(withdrawMoneyButton);
        this.add(Panel4);

        this.setVisible(true);
    }
}
