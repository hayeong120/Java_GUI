package org.example;

import javax.swing.*;
import java.awt.*;

public class Panel2 {
    public static void main(String args[]) {
        JFrame f1 = new JFrame();
        //f1.setSize(1200,700);    // Frame 사이즈 지정
        f1.setPreferredSize(new Dimension(1200,700));
        f1.setLayout(null);     // 배치관리자
        f1.setVisible(true);        // 창이 눈에 보이도록 함
        f1.setResizable(false);		//사이즈 재조정 불가능
        f1.setLocationRelativeTo(null);		//창이 가운데에 뜨도록 함

        JPanel p1 = new JPanel();
        //p1.setBackground(Color.white);
        p1.setBounds(500, 300, 300, 150);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        JLabel l1 = new JLabel("이름 생성");
        //l1.setBounds(0,0,50,50);
        l1.setHorizontalAlignment(JLabel.LEFT);

        JPanel p2 = new JPanel();
        p2.add(l1);
        p2.setBackground(Color.white);

        //버튼
        JButton b1 = new JButton();

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
        p3.add(new TextField());
        p3.add(new Button());

        JPanel p4 = new JPanel();
        p4.add(new Button());

        p1.add(p2);
        p1.add(p3);
        p1.add(p4);

        f1.add(p1);

        f1.pack();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
