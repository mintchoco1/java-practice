package test.frame;

import javax.swing.*;

import java.awt.*;

public class MyFrame3 extends JFrame {
    //생성자
    public MyFrame3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(200, 200);

        //flowout 객체 전달하기
        setLayout(new FlowLayout(FlowLayout.LEFT));

        //버튼만들기
        JButton btn1 = new JButton("버튼1");
        JButton btn2 = new JButton("버튼2");
        JButton btn3 = new JButton("버튼3");

        //프레임에 추가하기
        add(btn1);
        add(btn2);
        add(btn3);

        Container container = getContentPane();

        container.setLayout(new FlowLayout(FlowLayout.LEFT));

        container.add(new JButton("버튼 4"));
        container.add(new JButton("버튼 5"));
        container.add(new JButton("버튼 6"));
        container.add(new JButton("버튼 7"));

        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame3();
    }
}
