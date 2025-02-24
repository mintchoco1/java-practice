package pratice;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayoutEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(1, 10));

        for (int i = 0; i < 10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            this.add(button);
        }
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
