/*package calc.com;
import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calcProj extends JPanel {
    public static JTextArea calDisplay = new JTextArea();
    public static JTextArea answerArea = new JTextArea();

calcProj(){
    this.setPreferredSize(new Dimension(400,600));
    this.setLayout(new FlowLayout());
    this.setBackground(Color.yellow);
    this.add(calDisplayLabel());
    this.add(calDisplayLabel1());

    //this creates general panel
    JPanel generalPanel = new JPanel();
    generalPanel.setBackground(Color.red);
    generalPanel.setLayout(new GridLayout(2,1));
    generalPanel.add(calDisplayPanel());
    generalPanel.add(calDisplayPanel1());
    generalPanel.setPreferredSize(new Dimension(400,500));
    this.add(generalPanel);


}
public JTextArea calDisplayLabel() {
    calcProj.calDisplay.setCaretPosition(0);
    calcProj.calDisplay.setEditable(true);
    calcProj.calDisplay.setLineWrap(true);
    calcProj.calDisplay.setWrapStyleWord(true);
    calcProj.calDisplay.setFont(new Font("Monospaced", Font.PLAIN, 20));
    calcProj.calDisplay.setCaretColor(Color.CYAN);
    calcProj.calDisplay.setBackground(Color.black);
    calcProj.calDisplay.setForeground(Color.white);
    calcProj.calDisplay.setOpaque(true);
    calcProj.calDisplay.setPreferredSize(new Dimension(400, 100));
    calcProj.calDisplay.setBorder(BorderFactory.createLineBorder(Color.blue));
    return calcProj.calDisplay;
}
    //method to display answer
    //method to create a displaying label
    public JTextArea calDisplayLabel1(){
        answerArea.setCaretPosition(0);
        answerArea.setText("Answer: ");
        answerArea.setEditable(true);
        answerArea.setLineWrap(true);
        answerArea.setWrapStyleWord(true);
        answerArea.setFont(new Font("Monospaced",Font.PLAIN,16));
        answerArea.setCaretColor(Color.CYAN);
        answerArea.setBackground(Color.black);
        answerArea.setForeground(Color.green);
        answerArea.setOpaque(true);
        answerArea.setPreferredSize(new Dimension(400,60));
        answerArea.setBorder(BorderFactory.createLineBorder(Color.blue));
        answerArea.setVisible(false);
        return answerArea;
    }

//method to create a button's panel
public JPanel calDisplayPanel(){
    JPanel calDisplayPanel = new JPanel();
    calDisplayPanel.setBackground(Color.blue);
    calDisplayPanel.setLayout(new FlowLayout());
    calDisplayPanel.setSize(new Dimension(350,500));
    calDisplayPanel.setAlignmentY(30);
    calDisplayPanel.setBorder(BorderFactory.createLineBorder(Color.green));
    calDisplayPanel.setFocusable(false);
    //create the buttons
    for(int i=0; i<10; i++){
        calDisplayPanel.add(calDisplayButton(i));
    }
    //create other buttons sections
    return calDisplayPanel;
}
//method to create a button2's panel
public JPanel calDisplayPanel1(){
    JPanel calDisplayPanel = new JPanel();
    calDisplayPanel.setBackground(Color.blue);
    calDisplayPanel.setLayout(new FlowLayout());
    calDisplayPanel.setSize(new Dimension(350,500));
    calDisplayPanel.setBorder(BorderFactory.createLineBorder(Color.green));
    calDisplayPanel.setFocusable(false);

    JPanel CenterPanel = new JPanel();
    CenterPanel.setBackground(Color.green);
    CenterPanel.setLayout(new FlowLayout());
    CenterPanel.setPreferredSize(new Dimension(350,150));
    CenterPanel.setFocusable(false);
    char[] arr={'X','+','-','/','C','='};
    //create the buttons
    for (char c : arr) {
        CenterPanel.add(calDisplayButton1(c));
    }
    calDisplayPanel.add(CenterPanel);
    calDisplayPanel.add(CenterPanel);

    //create other buttons sections
    return calDisplayPanel;
}

//method to add buttons in the panel
public JButton calDisplayButton(int text) {
    String txt = String.valueOf(text);
    JButton calDisplayButton = new JButton();
    calDisplayButton.setPreferredSize(new Dimension(170, 40));
    calDisplayButton.setBackground(Color.black);
    calDisplayButton.setForeground(Color.white);
    calDisplayButton.setText(txt);
    calDisplayButton.setBorder(BorderFactory.createLineBorder(Color.blue));
    calDisplayButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            calDisplayButton.setBackground(Color.green);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            calDisplayButton.setBackground(Color.black);
        }
    });
    calDisplayButton.addActionListener(new ActionListener() {
        String buttonPressed;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == calDisplayButton) {
                buttonPressed = calDisplayButton.getText();
                if (calDisplay.getText().isEmpty()) {
                    calDisplay.setText(buttonPressed);
                } else {
                    calDisplay.append(buttonPressed);
                }
            }
        }
    });
    return calDisplayButton;

}
//method to add buttons in the panel
public JButton calDisplayButton1(char text) {
    String txt = String.valueOf(text);
    JButton calDisplayButton = new JButton();
    calDisplayButton.setPreferredSize(new Dimension(100, 40));
    calDisplayButton.setBackground(Color.black);
    calDisplayButton.setForeground(Color.white);
    calDisplayButton.setText(txt);
    calDisplayButton.setBorder(BorderFactory.createLineBorder(Color.blue));
    calDisplayButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            calDisplayButton.setBackground(Color.green);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            calDisplayButton.setBackground(Color.black);
        }
    });
    calDisplayButton.addActionListener(new ActionListener() {
        String buttonPressed;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == calDisplayButton) {
                buttonPressed = calDisplayButton.getText();
                if (buttonPressed.equals("C")) {
                    calDisplay.setText("");
                    answerArea.setText("Answer: ");
                    answerArea.setVisible(false);

                } else if (buttonPressed.equals("=")) {
                    answerArea.setText("Answer: ");
                    answerArea.append(compute(calDisplay.getText()));
                    answerArea.setVisible(true);
                } else {
                    if (calDisplay.getText().isEmpty()) {
                        calDisplay.setText(buttonPressed);
                    } else {
                        calDisplay.append(buttonPressed);
                    }
                }


            }
        }
    });
    return calDisplayButton;
}
//compute method
public String compute(String item){
    String input = item.trim();
    System.out.println(input);
    int result = 0;

    try {
        if (input.contains("X") || input.contains("x")) {
            String[] parts = input.split("(?i)x");
            result = Integer.parseInt(parts[0].trim()) * Integer.parseInt(parts[1].trim());
        } else if (input.contains("+")) {
            String[] parts = input.split("\\+");
            result = Integer.parseInt(parts[0].trim()) + Integer.parseInt(parts[1].trim());
        } else if (input.contains("-")) {
            String[] parts = input.split("-");
            result = Integer.parseInt(parts[0].trim()) - Integer.parseInt(parts[1].trim());
        } else if (input.contains("/")) {
            String[] parts = input.split("/");
            int denominator = Integer.parseInt(parts[1].trim());
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }
            result = Integer.parseInt(parts[0].trim()) / denominator;
        } else {
            answerArea.setText("Unsupported operation.");
        }
    } catch (NumberFormatException e) {
        answerArea.setText("Invalid number format.");
    } catch (ArithmeticException e) {
        answerArea.setText("Math error: " + e.getMessage());
    }

    return String.valueOf(result);
}
}
*/










