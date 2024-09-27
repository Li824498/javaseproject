package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
//        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
