package gui.image;

import javax.swing.*;

public class FrameImage extends JFrame {

    public FrameImage() {
        ImageIcon icon = new ImageIcon("imgs/Desk office.jpeg");
        JLabel lb1 = new JLabel(icon, JLabel.CENTER);//jlabel은 텍스트, 이미지 둘다 표시 가능한 컴포넌트
        add(lb1);

        setTitle("Frame Image2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 200);
        setSize(800, 600);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FrameImage();
    }
}
