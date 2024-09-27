package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Test2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录窗口");// 创建一个窗口

        JPanel panel = new JPanel();// 创建一个面板
        jf.add(panel);// 把面板添加到窗口中

        jf.setSize(400, 300);// 设置窗口大小
        jf.setLocationRelativeTo(null);// 设置窗口居中,距离中心点的距离为0
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 点击关闭按钮，程序退出
        JButton jb = new JButton("登录");// 创建一个按钮
        panel.add(jb);// 把按钮添加到面板中

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);
    }
}

class MyActionListener implements ActionListener {
    private JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent a){
        JOptionPane.showMessageDialog(jf, "等了");
    }
}
