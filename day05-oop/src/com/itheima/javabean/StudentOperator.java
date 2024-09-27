package com.itheima.javabean;

public class StudentOperator {
    private Student s;
    public StudentOperator(Student s){
        this.s = s;

    }
    public void printTotalScore(){
        System.out.println(s.getMath());

    }

    public void printAverageScore(){
        System.out.println(s.getChinese());
    }
}
