package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        //  快速入门Swing
        //  1.创建一个登录窗口
        JFrame jf = new JFrame("登录窗口");// 创建一个窗口

        JPanel panel = new JPanel();// 创建一个面板
        jf.add(panel);// 把面板添加到窗口中

        jf.setSize(400, 300);// 设置窗口大小
        jf.setLocationRelativeTo(null);// 设置窗口居中,距离中心点的距离为0
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 点击关闭按钮，程序退出
        JButton jb = new JButton("登录");// 创建一个按钮
        panel.add(jb);// 把按钮添加到面板中


        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "有人点击了登录");
            }
        });

        //
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("===========");
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("shang");
                }
            }
        });

        jf.setVisible(true);// 显示窗口

        jf.requestFocus();// 让窗口获取焦点
    }
}
