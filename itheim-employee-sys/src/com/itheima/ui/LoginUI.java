package com.itheima.ui;

import com.itheima.bean.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginUI extends JFrame implements ActionListener{


    private JTextField loginNameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    private static ArrayList<User> allUsers = new ArrayList<User>();

    static {
        allUsers.add(new User("超级管理员", "123456", "admin"));
        allUsers.add(new User("普通员工", "123456", "employee"));
    }

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

        loginNameField = new JTextField();
        loginNameField.setBounds(120, 20, 150, 25);
        add(loginNameField);

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

        loginButton.addActionListener(this);

        registerButton.addActionListener(this);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if(btn == loginButton) {
            login();
        } else if (btn == registerButton) {
            System.out.println("注册");
        }
    }

    private void login() {
        String loginName = loginNameField.getText();
        String password = new String(passwordField.getPassword());

        User user = getUserByLoginName(loginName);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                System.out.println("登陆成功");
                new EmployeeManagementUI(user.getUsername());//?????????
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,"密码错误");
            }
        } else {
            JOptionPane.showMessageDialog(this,"用户不存在");
        }

    }

    private User getUserByLoginName(String loginName) {
        for (int i = 0; i < allUsers.size(); i++) {
            User user = allUsers.get(i);
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null;
    }
}

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            LoginUI ums = new LoginUI();
//            ums.crateAndShowGUI();
//            ums.setVisible(true);
//        });
//    }


