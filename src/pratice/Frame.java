package pratice;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("some text");
        JButton button1 = new JButton("click me");
        JButton button2 = new JButton("exit");//프로그램 종료 버튼
        JTextArea textArea = new JTextArea();//많은 글을 넣을때
        JTextField textField = new JTextField("JTextField");//한줄 정도의 텍스트
        JPanel btnpanel = new JPanel();//버튼 대신에 패널을 넣는다

        panel.setLayout(new BorderLayout());//버튼, 원하는 방식대로 위치할 수 있음

        panel.add(label, BorderLayout.NORTH);
        panel.add(btnpanel, BorderLayout.WEST);
        panel.add(textArea, BorderLayout.CENTER);
        btnpanel.add(button1);
        btnpanel.add(button2);
        //panel.add(textField, BorderLayout.EAST);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //클릭 했을때 행동을 해라. 기능 추가
                textArea.append("you clicked me\n");
                label.setText(textArea.getText());//글자를 불러오기
            }
        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

    }
}
