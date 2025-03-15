package swing.action;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    private JPanel panel;
    private JButton btn1;
    private JButton btn2;

    MyListener listener = new MyListener();

    public MyFrame() {
        setTitle("My Frame");
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        btn1 = new JButton("노란색");
        btn2 = new JButton("파란색");
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);

        panel.add(btn1);
        panel.add(btn2);
        add(panel);
    }
    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn1){
                panel.setBackground(Color.YELLOW);
            }else {
                panel.setBackground(Color.BLUE);
            }
        }
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
