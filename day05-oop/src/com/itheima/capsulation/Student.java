package com.itheima.capsulation;

public class Student {
    String name;
    private int age;
    private double chinese;
    private double math;

    public void printAllScore(){
        System.out.println(name + "allscore:" + (chinese + math));

    }

    public void setAge(int age){
        this.age = age;

    }

    public int getAge(){
        return age;
    }




}
