package com.itheima.polymorphsm1;

public class Animal {

    String name = "动物";
    public static void main(String[] args) {
        Animal a1 = new Wolf();
        a1.run();
    }
    public void run(){
        System.out.println("动物会跑");
    }
}
