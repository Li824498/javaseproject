package com.itheima.thisDeemo;

public class toolss {

    private static int count;

    private toolss() {}

    public static void printHello(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("HelloWorld");

        }
        System.out.println(++count);
    }
}
