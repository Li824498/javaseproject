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
员工信息管理界面，要求包含输入框，搜索按钮，表格，表格展示20个员工信息，并包含添加、修改、删除功能。要求如下：1、输入框和搜索按钮、添加按钮占第一行并且居中 2、中间展示表格 3、每行数据右键绑定一个菜单，菜单展示修改和删除按钮

原版代码：
    
    package com.itheima.ui;
    
    import javax.swing.*;
    import javax.swing.table.DefaultTableModel;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.ArrayList;
    
    public class EmployeeManagementUI extends JFrame {
    private JTextField searchField;
    private JButton searchButton;
    private JButton addButton;
    private JTable employeeTable;
    private DefaultTableModel tableModel;
    private ArrayList<String[]> employeeData;
    
        public EmployeeManagementUI() {
            setTitle("员工信息管理系统");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());
    
            // 输入框和按钮面板
            JPanel panel = new JPanel();
            searchField = new JTextField(15);
            searchButton = new JButton("搜索");
            addButton = new JButton("添加");
    
            panel.add(searchField);
            panel.add(searchButton);
            panel.add(addButton);
            panel.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    
            // 表格
            String[] columnNames = {"员工ID", "姓名", "职位", "部门"};
            tableModel = new DefaultTableModel(columnNames, 0);
            employeeTable = new JTable(tableModel);
            employeeData = new ArrayList<>();
            populateTable();
    
            // 右键菜单
            JPopupMenu contextMenu = new JPopupMenu();
            JMenuItem editMenuItem = new JMenuItem("修改");
            JMenuItem deleteMenuItem = new JMenuItem("删除");
    
            editMenuItem.addActionListener(e -> editEmployee());
            deleteMenuItem.addActionListener(e -> deleteEmployee());
    
            contextMenu.add(editMenuItem);
            contextMenu.add(deleteMenuItem);
    
            employeeTable.setComponentPopupMenu(contextMenu);
            employeeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            employeeTable.setDefaultEditor(Object.class, null); // 禁止直接编辑
    
            employeeTable.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        contextMenu.show(employeeTable, e.getX(), e.getY());
                    }
                }
            });
    
            add(panel, BorderLayout.NORTH);
            add(new JScrollPane(employeeTable), BorderLayout.CENTER);
    
            // 按钮功能
            addButton.addActionListener(e -> addEmployee());
            searchButton.addActionListener(e -> searchEmployee());
        }
    
        private void populateTable() {
            // 示例数据
            for (int i = 1; i <= 20; i++) {
                String[] employee = {"E" + i, "员工" + i, "职位" + i, "部门" + i};
                employeeData.add(employee);
                tableModel.addRow(employee);
            }
        }
    
        private void addEmployee() {
            // 添加员工逻辑 (示例)
            String id = JOptionPane.showInputDialog("输入员工ID:");
            String name = JOptionPane.showInputDialog("输入员工姓名:");
            String position = JOptionPane.showInputDialog("输入员工职位:");
            String department = JOptionPane.showInputDialog("输入员工部门:");
            if (id != null && name != null && position != null && department != null) {
                String[] newEmployee = {id, name, position, department};
                employeeData.add(newEmployee);
                tableModel.addRow(newEmployee);
            }
        }
    
        private void editEmployee() {
            int selectedRow = employeeTable.getSelectedRow();
            if (selectedRow != -1) {
                String id = (String) tableModel.getValueAt(selectedRow, 0);
                String name = (String) tableModel.getValueAt(selectedRow, 1);
                String position = (String) tableModel.getValueAt(selectedRow, 2);
                String department = (String) tableModel.getValueAt(selectedRow, 3);
    
                //
                System.out.println(id);
    
                name = JOptionPane.showInputDialog("修改员工姓名:", name);
                position = JOptionPane.showInputDialog("修改员工职位:", position);
                department = JOptionPane.showInputDialog("修改员工部门:", department);
    
                tableModel.setValueAt(name, selectedRow, 1);
                tableModel.setValueAt(position, selectedRow, 2);
                tableModel.setValueAt(department, selectedRow, 3);
    
    
            }
        }
    
        private void deleteEmployee() {
            int selectedRow = employeeTable.getSelectedRow();
            if (selectedRow != -1) {
                //
                System.out.println(selectedRow);
                tableModel.removeRow(selectedRow);
                employeeData.remove(selectedRow);
            }
        }
    
        private void searchEmployee() {
            String searchTerm = searchField.getText().toLowerCase();
            tableModel.setRowCount(0); // 清空表格
            for (String[] employee : employeeData) {
                if (employee[1].toLowerCase().contains(searchTerm)) {
                    tableModel.addRow(employee);
                }
            }
        }
    
        public static void main(String[] args) {
    
            EmployeeManagementUI ems = new EmployeeManagementUI();
            ems.setVisible(true);
    
        }
    }

改造为：

    package com.itheima.ui;
    
    import javax.swing.*;
    import javax.swing.table.DefaultTableModel;
    import javax.xml.crypto.Data;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.ArrayList;
    import java.util.Date;
    
    public class EmployeeManagementUI extends JFrame {
    private JFrame frame;
    private JTextField searchField;
    private JButton searchButton;
    private JButton addButton;
    private JTable employeeTable;
    private DefaultTableModel tableModel;
    private ArrayList<String[]> employeeData;
    
        public EmployeeManagementUI() {
            frame = this;
            initialize();
            this.setVisible(true);
    
        }
    
        public void initialize() {
            setTitle("员工信息管理系统");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());
    
            // 输入框和按钮面板
            JPanel panel = new JPanel();
            searchField = new JTextField(15);
            searchButton = new JButton("搜索");
            addButton = new JButton("添加");
    
            panel.add(searchField);
            panel.add(searchButton);
            panel.add(addButton);
            panel.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    
            // 表格
            String[] columnNames = {"员工ID", "姓名", "性别", "年龄", "职位", "入职时间", "部门"};
            tableModel = new DefaultTableModel(columnNames, 0);
            employeeTable = new JTable(tableModel);
            employeeData = new ArrayList<>();
            populateTable();
    
            // 右键菜单
            JPopupMenu contextMenu = new JPopupMenu();
            JMenuItem editMenuItem = new JMenuItem("修改");
            JMenuItem deleteMenuItem = new JMenuItem("删除");
    
            editMenuItem.addActionListener(e -> editEmployee());
            deleteMenuItem.addActionListener(e -> deleteEmployee());
    
            contextMenu.add(editMenuItem);
            contextMenu.add(deleteMenuItem);
    
            employeeTable.setComponentPopupMenu(contextMenu);
            employeeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            employeeTable.setDefaultEditor(Object.class, null); // 禁止直接编辑
    
            employeeTable.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        contextMenu.show(employeeTable, e.getX(), e.getY());
                    }
                }
            });
    
            add(panel, BorderLayout.NORTH);
            add(new JScrollPane(employeeTable), BorderLayout.CENTER);
    
            // 按钮功能
            addButton.addActionListener(e -> addEmployee());
            searchButton.addActionListener(e -> searchEmployee());
        }
    
        private void populateTable() {
            // 示例数据
            for (int i = 1; i <= 20; i++) {
                String[] employee = {"E" + i, "员工" + i, "男", "21", "职位" + i, new Date().toLocaleString(), "部门" + i};
                employeeData.add(employee);
                tableModel.addRow(employee);
            }
        }
    
        private void addEmployee() {
            // 添加员工逻辑 (示例)
            String id = JOptionPane.showInputDialog("输入员工ID:");
            String name = JOptionPane.showInputDialog("输入员工姓名:");
            String position = JOptionPane.showInputDialog("输入员工职位:");
            String department = JOptionPane.showInputDialog("输入员工部门:");
            if (id != null && name != null && position != null && department != null) {
                String[] newEmployee = {id, name, position, department};
                employeeData.add(newEmployee);
                tableModel.addRow(newEmployee);
            }
        }
    
        private void editEmployee() {
            int selectedRow = employeeTable.getSelectedRow();
            if (selectedRow != -1) {
                String id = (String) tableModel.getValueAt(selectedRow, 0);
                String name = (String) tableModel.getValueAt(selectedRow, 1);
                String position = (String) tableModel.getValueAt(selectedRow, 2);
                String department = (String) tableModel.getValueAt(selectedRow, 3);
    
                //
                System.out.println(id);
    
                name = JOptionPane.showInputDialog("修改员工姓名:", name);
                position = JOptionPane.showInputDialog("修改员工职位:", position);
                department = JOptionPane.showInputDialog("修改员工部门:", department);
    
                tableModel.setValueAt(name, selectedRow, 1);
                tableModel.setValueAt(position, selectedRow, 2);
                tableModel.setValueAt(department, selectedRow, 3);
    
    
            }
        }
    
        private void deleteEmployee() {
            int selectedRow = employeeTable.getSelectedRow();
            if (selectedRow != -1) {
                //
                System.out.println(selectedRow);
                tableModel.removeRow(selectedRow);
                employeeData.remove(selectedRow);
            }
        }
    
        private void searchEmployee() {
            String searchTerm = searchField.getText().toLowerCase();
            tableModel.setRowCount(0); // 清空表格
            for (String[] employee : employeeData) {
                if (employee[1].toLowerCase().contains(searchTerm)) {
                    tableModel.addRow(employee);
                }
            }
        }
    
        public static void main(String[] args) {
    
            EmployeeManagementUI ems = new EmployeeManagementUI();
            ems.setVisible(true);
    
        }
    }


### 3、准备系统的角色类

用户类、员工信息类。
```java
package com.itheima.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String loginName;
}


```
```java
package com.itheima.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String phone;
    private String position;
    private String entryDate;
    private double salary;
    private String department;

}

```

### 开发步骤
1、给登录按钮绑定一个事件监听器
2、一旦点击登录按钮，拿到输入框输入的用户名和密码
3、去集合中检查：1.认证通过，跳转到用户管理系统 2.用户名不存在 3.用户名存在但密码错误
```java
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
                new EmployeeManagementUI();//?????????
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
```
## 5、完成信息管理界面的功能开发（核心功能）
1、登陆成功后，把登录成功的用户名传给信息管理界面。
2、添加员工信息的功能。
  -- 把员工信息封装成一个员工对象，存入到系统集和中去，然后刷新表格，展示最新添加的数据

## 6、删除某行数据的功能
开发完成