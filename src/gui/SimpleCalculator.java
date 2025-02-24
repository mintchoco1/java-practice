package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JPanel MainPanel;
    private JPanel TopPanel;
    private JPanel BottomPanel;
    private JTextField textField1;
    private JButton addButton;
    private JButton modButton;
    private JButton clearButton;
    private JTextField textfield2;
    private JTextField textfield3;

    public SimpleCalculator() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText().trim();
                String num2 = textfield2.getText().trim();
                double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                textfield3.setText(result + "");
            }
        });
    }//end constructor

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane(new SimpleCalculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}//end simple calculator
