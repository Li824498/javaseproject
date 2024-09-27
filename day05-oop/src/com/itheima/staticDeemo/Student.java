package com.itheima.staticDeemo;

public class Student {
    static String name;
    int age;
    static int count = 0;

    public Student(){
        Student.count ++;
        //count ++;
    }
}
