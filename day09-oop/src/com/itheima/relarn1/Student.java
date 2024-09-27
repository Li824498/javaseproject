package com.itheima.relarn1;



public class Student extends People{
    private int score;
    @Override
    public void say(){
        System.out.println("我是学生");
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student(int score) {
        this.score = score;
    }
}
