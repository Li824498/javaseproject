# 结合ai使用gui编程实现一个黑马人事管理系统
第一步：创建一个模块做这个项目。

第二步：分析项目的业务需求

+ 提供一个登录和注册用户的界面
+ 提供一个人事信息的管理界面：展示全部员工信息，提供一个根据名称查询某个员工信息展示，添加员工信息，删除员工信息，修改员工信息。

  + 分析项目的角色：
    
    + 登录用户：登录名称、密码

    员工信息： ID，姓名，性别，年龄，电话，职位，入职时间，薪水，部门信息。
  + 分析系统的界面：

    + 登录界面类： 创建登录界面
  
    + 信息管理界面类：创建管理界面

+ 第三步：结合AI开始开发：通义千问
  + AI帮我们生成一个登录界面
  + AI帮我们生成一个员工信息管理界面

## 正在开发：
### 1、拿到登录界面的程序，并进行了修改。

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
    




定义了一个APP的启动类：

    import com.itheima.ui.LoginUI;
    
    public class App {
    public static void main(String[] args) {
    LoginUI usm = new LoginUI();
    }
    }

### 2、拿到管理信息的界面：

