package action;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class MyFrame2 extends JFrame implements ActionListener {
    private JButton btn1;
    private JButton btn2;

    public MyFrame2() {
        this.setTitle("MyFrame2");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2,1));
        btn1 = new JButton("Button1");
        btn2 = new JButton("Button2");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        panel.add(btn1);
        panel.add(btn2);
        this.add(panel);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1) {
            System.out.println("버튼 1 클릭");
        }else if(e.getSource() == btn2) {
            System.out.println("버튼 2 클릭");
        }
    }

    public static void main(String[] args) {
        new MyFrame2();
    }
}

