package com.itheima.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginUI() {
        setTitle("用户管理系统");
        setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        crateAndShowGUI();
    }

    public void crateAndShowGUI() {
        JLabel usernameLabel = new JLabel("用户名:");
        usernameLabel.setBounds(30, 20, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 20, 150, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(30, 60, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 60, 150, 25);
        add(passwordField);

        loginButton = new JButton("登录");
        loginButton.setBounds(30, 100, 100, 25);
        add(loginButton);

        registerButton = new JButton("注册");
        registerButton.setBounds(170, 100, 100, 25);
        add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 登录逻辑
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                System.out.println("用户名: " + username + ", 密码: " + password);
                // 在这里可以添加验证逻辑
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 注册逻辑
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                System.out.println("注册用户名: " + username + ", 密码: " + password);
                // 在这里可以添加注册逻辑
            }
        });
        setVisible(true);

    }
}

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            LoginUI ums = new LoginUI();
//            ums.crateAndShowGUI();
//            ums.setVisible(true);
//        });
//    }


