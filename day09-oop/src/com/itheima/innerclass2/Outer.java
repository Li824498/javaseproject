package com.itheima.innerclass2;

public class Outer {
    private static int num = 2;


    //  静态内部类
    //  1. 静态内部类可以直接访问外部类的静态成员，不可以访问外部类的实例成员
    public static class Inner{


        public void show() {
            System.out.println("123");
            System.out.println(num);
        }
    }
}
