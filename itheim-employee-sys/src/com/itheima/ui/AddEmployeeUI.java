package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployeeUI extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JComboBox<String> genderComboBox;
    private JTextField ageField;
    private JTextField phoneField;
    private JTextField positionField;
    private JTextField hireDateField;
    private JTextField salaryField;
    private JTextField departmentField;

    public AddEmployeeUI(EmployeeManagementUI employeeManagementUI) {
        setTitle("添加员工");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(10, 2));

        // 添加输入框和标签
        add(new JLabel("员工ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("姓名:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("性别:"));
        genderComboBox = new JComboBox<>(new String[]{"男", "女"});
        add(genderComboBox);

        add(new JLabel("年龄:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("电话:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("职位:"));
        positionField = new JTextField();
        add(positionField);

        add(new JLabel("入职时间:"));
        hireDateField = new JTextField();
        add(hireDateField);

        add(new JLabel("薪水:"));
        salaryField = new JTextField();
        add(salaryField);

        add(new JLabel("部门:"));
        departmentField = new JTextField();
        add(departmentField);

        // 添加按钮
        JButton addButton = new JButton("添加");
        add(addButton);

        // 取消按钮
        JButton cancelButton = new JButton("取消");
        add(cancelButton);

//        // 添加按钮的事件处理
//        addButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 获取输入信息
//                String id = idField.getText();
//                String name = nameField.getText();
//                String gender = (String) genderComboBox.getSelectedItem();
//                String age = ageField.getText();
//                String phone = phoneField.getText();
//                String position = positionField.getText();
//                String hireDate = hireDateField.getText();
//                String salary = salaryField.getText();
//                String department = departmentField.getText();
//
//                // 在这里可以添加添加员工的逻辑
//                // 例如，将信息保存到数据库或更新到表格
//
//                JOptionPane.showMessageDialog(AddEmployeeUI.this, "员工添加成功！");
//                dispose(); // 关闭窗口
//            }
//        });

        addButton.addActionListener(e -> {
            Employee employee = new Employee();
            employee.setId(Integer.parseInt(idField.getText()));
            employee.setName(nameField.getText());
            employee.setSex(genderComboBox.getSelectedItem().toString());
            employee.setAge(Integer.parseInt(ageField.getText()));
            employee.setPhone(phoneField.getText());
            employee.setPosition(positionField.getText());
            employee.setEntryDate(hireDateField.getText());
            employee.setSalary(Double.parseDouble(salaryField.getText()));
            employee.setDepartment(departmentField.getText());
            employeeManagementUI.addEmployee(employee);
            dispose();

        });

        // 取消按钮的事件处理
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 关闭窗口
            }
        });


        setVisible(true);
    }

//    public static void main(String[] args) {
//        new AddEmployeeUI();
//    }
}
