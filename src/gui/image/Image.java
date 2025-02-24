package gui.image;

import javax.swing.*;
import java.awt.*;

public class Image {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel lb1 = new JLabel(" ", JLabel.CENTER);
        ImageIcon icon = new ImageIcon("imgs/Desk office.jpeg");//imageicon은 이미지를 표시하는 데 사용되는 클래스
        lb1.setIcon(icon);//생성한 imageicon 객체를 jlabel에 설정하여 jalbel 에 이미지를 표시
        frame.add(lb1);

        frame.setTitle("Image Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
