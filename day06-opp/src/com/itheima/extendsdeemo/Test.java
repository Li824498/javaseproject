package com.itheima.extendsdeemo;

public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSkill("java");
        t.setSex('男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
