package com.itheima.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    //写一个方法，生成10个随机数
    public static void getRandom(){
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*100));
        }
    }
}
