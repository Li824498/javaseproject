package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("aaa");
        s.setChinese(123);
        s.setMath(234);
        System.out.println(s.getName());
        System.out.println(s.getChinese());
        System.out.println(s.getMath());

        StudentOperator so = new StudentOperator(s);
        so.printAverageScore();
        so.printTotalScore();
    }
}
