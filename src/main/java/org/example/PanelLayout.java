package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelLayout {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setLocation(300, 200);
        frame.setPreferredSize(new Dimension(600,300));
        Container contentPane = frame.getContentPane();

        JButton b1 = new JButton("button1");
        JButton b2 = new JButton("button2");
        JButton b3 = new JButton("button3");
        JButton b4 = new JButton("button4");

        contentPane.add(b1, "Center");
        contentPane.add("West", b2);
        contentPane.add(b3, BorderLayout.SOUTH);
        contentPane.add(b4, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
