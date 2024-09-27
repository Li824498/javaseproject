package com.itheima.innerclass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        // 目标：理解静态内部类的使用目标：
        //
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        //  1. 静态内部类可以直接访问外部类的静态成员，不可以访问外部类的实例成员
        //
    }
}
