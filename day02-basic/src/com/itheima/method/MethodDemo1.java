package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        print();
        int c;
        c = sum(1,2);
        System.out.println(c);
        int d = sum(1);
        System.out.println(d);

    }

    public static void print(){
        System.out.println("test");
    }

    //重载的学习

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a){
        return a;
    }
}
