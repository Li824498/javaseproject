package com.itheima.gui;

import javax.swing.*;

public class relearn {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();
        jf.add(panel);

        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("登录");
        panel.add(jb);


        jf.setVisible(true);


    }
}
