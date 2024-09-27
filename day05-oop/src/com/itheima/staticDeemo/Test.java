package com.itheima.staticDeemo;

public class Test {
    public static void main(String[] args) {
        Student.name = "saf";
        System.out.println(Student.name);

        Student s1 = new Student();
        s1.name = "asd";

        Student s2 = new Student();
        s2.name = "sdf";
        System.out.println(s1.name);

        new Student();

        System.out.println(Student.count);
    }
}
