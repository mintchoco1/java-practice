package pratice;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayoutEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentpane = getContentPane();

        contentpane.setLayout(new BorderLayout(30, 20));

        contentpane.add(new JButton("버튼 1 "), BorderLayout.CENTER);
        contentpane.add(new JButton("버튼 2 "), BorderLayout.NORTH);
        contentpane.add(new JButton("버튼 3 "), BorderLayout.SOUTH);
        contentpane.add(new JButton("버튼 4 "), BorderLayout.EAST);
        contentpane.add(new JButton("버튼 5 "), BorderLayout.WEST);

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
