package com.itheima.singleinstance;

public class A {
//    public static final A a = new A();
    private static A a = new A();

    private A() {

    }

    public static A returna(){
        return a;
    }

    public static A getInstance() {
        return a;
    }
}
