package com.itheima.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];
    // 静态代码块：有static修饰，属于类，与类一起加载，自动执行一次
    //跟着类走
    static {
        System.out.println("static code执行");
        schoolName = "黑马程序员";
        cards[0] = "A";
        cards[1] = "B";
        cards[2] = "C";

    }
    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(schoolName);
        System.out.println(Arrays.toString(cards));

    }
}
