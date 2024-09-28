package com.itheima;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        initFrame();
    }
    public void initFrame() {
        this.setTitle("石子迷宫 V 1.0 dlei");
        this.setSize(465, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
