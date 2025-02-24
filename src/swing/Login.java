package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login() {
        JPanel panel = new JPanel();//패널에 레이블 버튼 추가 비밀번호 추가할 칸 등등
        JLabel label = new JLabel("ID : ");
        JLabel pswrd = new JLabel("Password : ");
        JTextField txtid = new JTextField(10);
        JPasswordField tpassword = new JPasswordField(10);//안보이게 해주는
        JButton logbtn = new JButton("Log In");

        panel.add(label);
        panel.add(txtid);
        panel.add(tpassword);
        panel.add(pswrd);
        panel.add(logbtn);

        logbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = "Dan";
                String password = "Dan123";

                if(id.equals(txtid.getText()) && password.equals(tpassword.getText())) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                }else {
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
        });

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//화면 중앙에 창 띄우기
        setSize(600,400);
        setResizable(false);//사이즈 조정 불가능
    }
    public static void main(String[] args) {
        new Login();
    }
}
