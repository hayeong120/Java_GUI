package org.example;

import javax.swing.*;
import java.awt.*;

public class Panel2 {
    public static void main(String args[]) {
        JFrame f1 = new JFrame();
        f1.setSize(1200,700);    // Frame 사이즈 지정
        f1.setLayout(null);     // 배치관리자
        f1.setVisible(true);        // 창이 눈에 보이도록 함
        f1.setResizable(false);		//사이즈 재조정 불가능
        f1.setLocationRelativeTo(null);		//창이 가운데에 뜨도록 함

        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(400, 200, 400, 300);
        p1.setLayout(null);

        f1.add(p1);

        //f1.pack();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
