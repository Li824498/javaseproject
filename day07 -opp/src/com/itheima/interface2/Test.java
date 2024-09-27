package com.itheima.interface2;

public class Test {
    public static void main(String[] args) {
        People p = new Student();
        Driver d = new Student();
        BoyFriend bf = new Student();//多态，解耦合  A a = new B开发项目，选择业务


    }
}

interface Driver{}
interface BoyFriend{}

class People{}
class Student extends People implements Driver, BoyFriend{}//可以后续不断添加