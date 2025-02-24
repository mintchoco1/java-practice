package pratice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

    public ContentPaneEx() {
        setTitle("contentpaneex과 JFrame 예제");//프레임 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();//컨텐트팬 알아내기
        contentPane.setBackground(Color.orange);//배경색 주황색
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("확인"));
        contentPane.add(new JButton("취소"));
        contentPane.add(new JButton("무시"));

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
