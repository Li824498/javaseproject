package com.itheima.oop;

public class ClassLearn {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 100;
        s1.math = 100;
        System.out.println(s1.name + "CHENGJI:" + (s1.chinese + s1.math));
        s1.printAllScore();
    }
}
