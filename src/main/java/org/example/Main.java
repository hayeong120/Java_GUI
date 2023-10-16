package org.example;

import javax.swing.JFrame;      // Frame 클래스 호출
import javax.swing.JButton;     // Button 클래스 호출

public class Main {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();    // Frame 객체 생성
        JButton b1 = new JButton("CLICK");      // Button 객체 생성

        f1.setSize(300,400);    // Frame 사이즈 지정
        f1.setLayout(null);     // 배치관리자
        f1.setVisible(true);        // 창이 눈에 보이도록 함
        f1.setResizable(false);		//사이즈 재조정 불가능
        f1.setLocationRelativeTo(null);		//창이 가운데에 뜨도록 함

        b1.setBounds(150, 300, 100, 40);    // Button 위치, 사이즈 지정
        f1.add(b1);     // Button을 Frame에 생성

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // 프로그램 종료

    }
}