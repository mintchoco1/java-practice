package pratice;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class NULLContainerEx extends JFrame {

    public NULLContainerEx() {
        setTitle("NULLContainerEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        JLabel la = new JLabel("Yoon");
        la.setLocation(100, 100);
        la.setSize(300, 100);

        this.add(la);

        for(int i = 0; i<10; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setSize(300, 100);
            b.setLocation(100, 100);
            this.add(b);
        }
        setSize(300, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new NULLContainerEx();
    }
}
