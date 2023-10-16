package org.example;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String args[]) {
        Dimension dim = new Dimension(400, 150);        // 폭과 넓이

        JFrame frame = new JFrame("Panel Test1");
        frame.setLocation(200,400);         // 윈도우 창의 나타낼 위치
        frame.setPreferredSize(dim);

        JButton b1 = new JButton(new ImageIcon("C:\\Project\\Test\\src\\main\\java\\org\\example\\Group 42.png"));
        b1.setBorderPainted(false);

        frame.add(b1);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
