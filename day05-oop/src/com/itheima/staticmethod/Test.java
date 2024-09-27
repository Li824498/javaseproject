package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
        Student.printHelloWorld();

        Student s1 = new Student();
        s1.printHelloWorld();

        s1.setScore(70);

        s1.printPass();

        //只是为了做功能不访问对象数据，做成静态
        //对象行为的话，实例方法
    }
}
