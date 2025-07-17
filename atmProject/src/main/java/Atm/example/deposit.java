package Atm.example;

import javax.swing.*;
import java.awt.*;

public class deposit extends JFrame {
    public deposit() {

        this.setTitle("Deposit");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.getContentPane().setBackground(Color.green);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.gray);
        Panel.setPreferredSize(new Dimension(300, 50));
        JLabel AmountLabel = new JLabel("Amount");
        JTextField AmountField = new JTextField();
        AmountField.setPreferredSize(new Dimension(150, 30));
        Panel.add(AmountLabel);
        Panel.add(AmountField);
        this.add(Panel);

        JPanel Panel2 = new JPanel();
        Panel2.setBackground(Color.gray);
        Panel2.setPreferredSize(new Dimension(300, 50));
        JButton depositButton = new JButton("Ok");
        depositButton.setBackground(Color.cyan);
        depositButton.setPreferredSize(new Dimension(150, 30));
        depositButton.addActionListener(e ->{
            JOptionPane.showMessageDialog(new JFrame(),"Amount Deposited Successfully");
            this.dispose();
            new Home();
        });
        Panel2.add(depositButton);
        this.add(Panel2);

        this.setVisible(true);

    }
}
