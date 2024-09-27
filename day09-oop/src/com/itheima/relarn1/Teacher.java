package com.itheima.relarn1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Teacher extends People{
    @Override
    public void say(){
        System.out.println("我是老师");
    }

    public Teacher(String name, int age){
        super(name, age);
    }

    public Teacher(String name) {
        this(name, 18);
    }

    @Override
    public String toString(){
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
