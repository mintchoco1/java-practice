package pratice;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame {
    //생성자
    public MyFrame() {
        setSize(300,200);//크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램을 껐을때 모든걸 종료
        setTitle("프레임 작성예시");
        setLocationRelativeTo(null);//자동으로 가운데에 창 띄움
        setResizable(false);//true로 하면 자유자재로 바꾸기 가능. false로 하면 못 바꿈
        setLayout(new FlowLayout());//배치 관리자 설정
        JButton button = new JButton("버튼");

        //컴포넌트 생성 및 추가
        this.add(button);
        setVisible(true);//화면에 보이게 해주는 메소드
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
