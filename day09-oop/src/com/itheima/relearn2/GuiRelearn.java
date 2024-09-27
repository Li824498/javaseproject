package com.itheima.relearn2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GuiRelearn {
    public static void main(String[] args) {
        JFrame jf = new JFrame("test");

        JPanel jp = new JPanel();
        jf.add(jp);

        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        JButton jb = new JButton("登录");
        jp.add(jb);

//        jb.addActionListener((ActionEvent e) -> System.out.println("登录"));
        jb.addActionListener(new MyActionListener(jf));

        jf.requestFocus();
        jf.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                if (keycode == KeyEvent.VK_UP) {
                    System.out.println("up");
                }

            }
        });

        jf.requestFocus();

        jf.setVisible(true);


    }
}


class MyActionListener implements ActionListener{
    private JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf,"牛");
    }
}