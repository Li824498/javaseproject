package com.itheima.ui;

import com.itheima.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeManagementUI extends JFrame {
    private static ArrayList<Employee> employees = new ArrayList<>();


    private JFrame frame;
    private JTextField searchField;
    private JButton searchButton;
    private JButton addButton;
    private JTable employeeTable;
    private DefaultTableModel tableModel;
    private ArrayList<String[]> employeeData;

    public EmployeeManagementUI() {

    }

    public EmployeeManagementUI(String username) {
        super("欢迎：" + username + "进入登录界面");
        frame = this;
        initialize();
        this.setVisible(true);
    }

    public void initialize() {
//        setTitle("员工信息管理系统");
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
        deleteMenuItem.addActionListener(e -> {
            int selectedRow = employeeTable.getSelectedRow();
            if (selectedRow >= 0) {
                int id = (Integer) tableModel.getValueAt(selectedRow, 0);
//                deleteEmoployee(id);
                employees.remove(selectedRow);
                tableModel.removeRow(selectedRow);
            }

        });

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
//        addButton.addActionListener(e -> addEmployee());
        addButton.addActionListener(e -> {
            new AddEmployeeUI(this);
        });
        searchButton.addActionListener(e -> searchEmployee());
    }

    private void deleteEmoployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == id) {
                employees.remove(i);
                break;
            }
        }
    }

    private void populateTable() {
        // 示例数据
//        for (int i = 1; i <= 2; i++) {
//            String[] employee = {"E" + i, "员工" + i, "男", "21", "职位" + i, new Date().toLocaleString(), "部门" + i};
//            employeeData.add(employee);
//            tableModel.addRow(employee);
//        }
    }

//    private void addEmployee() {
//        // 添加员工逻辑 (示例)
//        String id = JOptionPane.showInputDialog("输入员工ID:");
//        String name = JOptionPane.showInputDialog("输入员工姓名:");
//        String position = JOptionPane.showInputDialog("输入员工职位:");
//        String department = JOptionPane.showInputDialog("输入员工部门:");
//        if (id != null && name != null && position != null && department != null) {
//            String[] newEmployee = {id, name, position, department};
//            employeeData.add(newEmployee);
//            tableModel.addRow(newEmployee);
//        }
//    }

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

    private void deleteEmployee(Employee e) {

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

    public void addEmployee(Employee employee) {
        employees.add(employee);
        tableModel.addRow(new Object[]{employee.getId(), employee.getName(), employee.getSex(), employee.getAge(), employee.getPosition(), employee.getEntryDate(), employee.getSalary(), employee.getDepartment()});
    }

//    public static void main(String[] args) {
//
//        EmployeeManagementUI ems = new EmployeeManagementUI();
//        ems.setVisible(true);
//
//    }
}
