package gui.table;

import javax.swing.*;
import java.awt.*;

public class Table {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table prac");
        JPanel panel = new JPanel();

        String[] headings = new String[]{"Name", "Age", "Gender"};
        Object[][] data = new Object[][]{
                {"1","daniel","korea"},
                {"2","male","male"},
                {"3","female","female"},
        };

        JTable table = new JTable(data, headings);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(700,600));

        table.setFillsViewportHeight(true);

        panel.add(scrollPane);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
    }
}
