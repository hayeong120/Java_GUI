package org.example;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String args[]) {
        Dimension dim = new Dimension(400, 150);        // 폭과 넓이

        JFrame frame = new JFrame("Panel Test1");
        frame.setLocation(200,400);         // 윈도우 창의 나타낼 위치
        frame.setPreferredSize(dim);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS));
        panel1.add(new JLabel("이름 : "));
        panel1.add(new JTextField());

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
        panel2.add(new JLabel("나이 : "));
        panel2.add(new JTextField());

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
        panel3.add(new JLabel("주소 : "));
        panel3.add(new JTextField());

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.add(panel1);
        panel4.add(panel2);
        panel4.add(panel3);

        frame.add(panel4, BorderLayout.CENTER);
        frame.add(new JButton("입력하기"), BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
