package test.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class MyFrame8 extends JFrame implements ActionListener{
    //필드 정의하기
    private JTextField inputmsg;

    public MyFrame8() {
        setSize(300, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //문자열을 입력할 수 있는 UI
        inputmsg = new JTextField(10);

        //Flowlayout 객체 전달하기
        setLayout(new FlowLayout());

        //전송 버튼
        JButton sendbtn = new JButton("전송");
        sendbtn.setActionCommand("send");
        sendbtn.addActionListener(this);
        add(sendbtn);

        //삭제버튼
        JButton deletebtn = new JButton("삭제");
        deletebtn.setActionCommand("delete");
        deletebtn.addActionListener(this);
        add(deletebtn);

        //패널 객체 생성해서
        JPanel panel = new JPanel();
        //패널에 UI를 추가
        panel.add(inputmsg);
        panel.add(deletebtn);
        panel.add(sendbtn);
        //패널 통째로 프레임에 추가하기
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame8();
    }

    //ActionListener 언터페이스를 구현해서 강제로 Override 한 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트가 발생한 버튼이 설정된 action command 읽어오기
        String command = e.getActionCommand();
        if (command.equals("send")) {
            //JTextfield에 입력한 문자열 읽어오기
            String msg = inputmsg.getText();
            JOptionPane.showMessageDialog(this, msg);
        }else if (command.equals("delete")) {
            //빈 문자열을 넣어tj 삭제해주기
            inputmsg.setText("");
        }
    }
}
