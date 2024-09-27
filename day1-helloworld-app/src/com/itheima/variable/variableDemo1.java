package com.itheima.variable;

public class variableDemo1 {
    public static void main(String[] args) {
        printVariable();

        int b =100;
        System.out.println(b);
        b = b + 2;
        System.out.println(b);
        b = 101;
        System.out.println(b);

        //分隔符号
        System.out.println("--------------------------------");

        //钱包程序
        //有9.9元
        double money = 9.9;
        System.out.println(money);
        //发出5元
        money = money - 5;
        System.out.println(money);

        //ascii
        char ch = 'a';
        ch = 'a' + 1;
        System.out.println(ch);

        //分隔符号
        System.out.println("--------------------------------");

        //进制学习
        int i1 = 0b00010001;
        System.out.println(i1);

        int i2 = 0111;
        System.out.println(i2);

        int i3 = 0xFA;
        System.out.println(i3);

        //数据类型学习
        byte b2 = 10;
        System.out.println(b);
        int i = 100;
        System.out.println(i);
        long l = 1234567890123456789L;
//        long l2 = 1234567890123456789;
        System.out.println(l);
//        System.out.println(l2);

        float f = 1.2F;
//        float f2 = 1.2;
        System.out.println(f);
//        System.out.println(f2);

        char c = 'a';
        System.out.println(c);

        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag);
        System.out.println(flag2);

        //分隔符号
        System.out.println("--------------------------------");

        //今天的学习先到这里
        System.out.println("今天的学习先到这里");
        System.out.println("今天是2024年9月17日");





    }

    //学习变量
    public static void printVariable(){
        int a = 10;

        System.out.println(a);
    }
}
