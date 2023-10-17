package org.example;

import com.sun.jdi.event.MonitorContendedEnteredEvent;

import javax.swing.*;
import java.awt.*;

public class NameTest {
    public static void main(String args[]) {
        JFrame f1 = new JFrame();
        //f1.setPreferredSize(new Dimension(1200,700));
        f1.setLocation(180,80);
        f1.setSize(1200,700);
        f1.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLUE);
        p1.setBounds(0,0,400,700);
        //p1.setLayout(null);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.RED);
        p2.setBounds(400,0,400,700);
        //p2.setLayout(null);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.GREEN);
        //p4.setBounds(400,300,400,700);
        //p4.setLayout(null);

        JPanel p5 = new JPanel();
        p5.setBackground(Color.MAGENTA);
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        p5.add(new Label("이름 생성"));
        p5.add(new TextField());
        //p5.setPreferredSize(new Dimension(400,100));
        //p5.setSize(400,50);
        //p5.setBounds(400,300,400,100);
        //p4.setLayout(null);

        JPanel p6 = new JPanel();
        p6.setBackground(Color.ORANGE);

        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        //p2.add(p4);
        p2.add(p5);
        //p2.add(p6);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.PINK);
        p3.setBounds(800,0,400,700);
        //p3.setLayout(null);




        f1.add(p1);
        f1.add(p2);
        f1.add(p3);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f1.pack();
        f1.setVisible(true);
    }
}
