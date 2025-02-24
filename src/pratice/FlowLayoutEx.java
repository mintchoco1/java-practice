package pratice;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.FlowLayout;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayoutEx 예지");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        contentPane.add(new JButton("버튼 1"));
        contentPane.add(new JButton("버튼 2"));
        contentPane.add(new JButton("버튼 3"));
        contentPane.add(new JButton("버튼 4"));
        contentPane.add(new JButton("버튼 5"));
        contentPane.add(new JButton("버튼 6"));

        setSize(300, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
