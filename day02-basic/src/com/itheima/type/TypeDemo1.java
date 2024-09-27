package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //自动类型转换学习
        byte a = 12;
        printInt(a);

        //强制类型转换学习
        //正常
        int b = 12;
        printByte((byte) b);
        //异常
        int c = 128;
        printByte((byte) c);
        //小数至整数
        float d = (float) -3.2;
        printInt((int)d);

    }

    public static int printInt(int a){
        System.out.println(a);
        return a;
    }

    public static byte printByte(byte a){
        System.out.println(a);
        return a;
    }

}
