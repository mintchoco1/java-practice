package gui.combo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combo {
    private JPanel mainpanel;
    private JPanel toppanel;
    private JPanel bottompanel;
    private JTextField canadianfield;
    private JComboBox comboBox1;
    private JButton convertButton;
    private JTextField converted;
    private JLabel moneytype;

    public Combo() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moneytype.setText(comboBox1.getSelectedItem().toString());
            }
        });
    }
}
