package com.itheima.staticmethod;

public class Test4 {

    public static int count = 100;
    public static void main(String[] args) {
        System.out.println(count);


    }
}
//1.静态方法只能直接擦做静态成员
//2.实例方法既可以直接访问静态成员+动态成员
//3.this只能被动态方法处理