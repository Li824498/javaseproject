package com.itheima.gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExmple {
    public static void main(String[] args) {
        JFrame frame= new JFrame("流式布局");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        frame.add(new JButton("button1"));
        frame.add(new JButton("button2"));
        frame.add(new JButton("button3"));
        frame.add(new JButton("button4"));
        frame.add(new JButton("button5"));

        frame.setVisible(true);
    }
}
