package com.itheima.lambda;

import com.itheima.innerclass3.Student;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //  目标：完成给数组排序，理解其中匿名内部类的用法
        Student[] students = new Student[6];
        students[0] = new Student("张三", 23, 171, '女');
        students[1] = new Student("李四", 22, 172, '男');
        students[2] = new Student("王五", 21, 173, '男');
        students[3] = new Student("赵六", 20, 174, '男');
        students[4] = new Student("钱七", 19, 175, '男');
        students[5] = new Student("孙八", 18, 176, '男');

        //


//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//
//                return o2.getAge() - o1.getAge();
//            }
//
//        });
//
//        Arrays.sort(students, (Student o1, Student o2) -> {//参数类型可以省略不写
//            //如果只有一个参数，可以省略（）小括号
//            //如果方法体只有一行代码，可以省略，{}，;，return去掉
//
//            return o2.getAge() - o1.getAge();
//        });
//
//        Arrays.sort(students, (o1, o2) -> {//参数类型可以省略不写
//            //如果只有一个参数，可以省略（）小括号
//            //如果方法体只有一行代码，可以省略，{}，;，return去掉
//
//            return o2.getAge() - o1.getAge();
//        });

        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }

    public static void test1() {

    }

    public static void test2() {
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        btn.addActionListener(e -> System.out.println("登录成功"));



//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("登录成功");
//            }
//        });

        win.setVisible(true);
    }
}
