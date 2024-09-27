package com.itheima.interface4;

public interface A {
    //1.默认方法,必须加default,public可省略
    public default void go(){
        System.out.println("默认方法");
//        run();
    }

    //2.私有方法（jdk9）
    //接口中的其他实例方法来调用
    private void run(){
        System.out.println("私有方法");
    }

    //3.静态方法
    static void show(){
        System.out.println("静态方法");

    }
}
