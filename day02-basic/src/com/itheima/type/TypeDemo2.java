package com.itheima.type;

/**
 *  学习类型转换的第二部分
 */
public class TypeDemo2 {
    public static void main(String[] args) {
        double a = sum(1, 1.1, 'a');
        System.out.println(a);
        int b = sum2((byte) 12,(byte) 12);
        System.out.println(b);

    }

    //1.自动升级 混合运算最高级别
    public static double sum(int a, double b, char c){
        return a + b + c;
    }

    //2.固定升级 byte,short,char自动转换成int参与计算
    public static int sum2(byte a, byte b){
        return (byte) (a + b);
    }

}
