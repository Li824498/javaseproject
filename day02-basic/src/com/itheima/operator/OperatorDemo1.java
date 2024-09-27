package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //1.5种运算符
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((float) a / b);
        System.out.println(a % b);

        //2.+的连接符
        System.out.println("itheima" + a);
        System.out.println(a + 'a' + "itheima");

        //3.自增自减
        test(10);

        System.out.println("======================================");

        //4.扩展运算符
        test2(10);

        System.out.println("======================================");

        //5.关系运算符
        test3(5,6);

        System.out.println("======================================");

        //6.三元运算符
        System.out.println(max(1, 2, 3));

        System.out.println("======================================");

        //7.逻辑运算符
        test4(true, false);



    }


    public static void test(int a){
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        a--;

        int c = ++a;
        System.out.println(a);
        System.out.println(c);
    }

    public static void test2(int a){
        System.out.println(a += 1);
        System.out.println(a -= 1);
        System.out.println(a *= 2);
        System.out.println(a /= 2);
        System.out.println(a %= 3);

    }

    public static void test3(int a, int b){
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

    }
    public static int max(int a, int b, int c){
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    public static void test4(boolean a, boolean b){
        int c = 0;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(!a);
        System.out.println(a ^ b);
        System.out.println(b && c++ > 1);
        System.out.println(c);
        System.out.println(a || c++ > 0);
        System.out.println(c);
    }
}
