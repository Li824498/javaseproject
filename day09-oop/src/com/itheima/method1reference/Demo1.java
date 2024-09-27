package com.itheima.method1reference;


import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        //  目标：完成给数组排序，理解其中匿名内部类的用法
        Student[] students = new Student[6];
        students[0] = new Student("张三", 23, 171, '女');
        students[1] = new Student("李四", 22, 172, '男');
        students[2] = new Student("王五", 21, 173, '男');
        students[3] = new Student("赵六", 20, 174, '男');
        students[4] = new Student("钱七", 19, 175, '男');
        students[5] = new Student("孙八", 18, 176, '男');

//        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
//        Arrays.sort(students, (o1, o2) -> Student.compareByAge(o1, o2));
        Arrays.sort(students, Student::compareByAge);
//

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }


}
