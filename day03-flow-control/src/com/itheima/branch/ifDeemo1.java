package com.itheima.branch;

/**
 *  学习if分支结构
 */

import java.util.Scanner;

public class ifDeemo1 {
    public static void main(String[] args) {
        test1(10);
        test2();
        test3();
    }

    public static void test1(int age){
        if (age > 18){
            System.out.println("可以上网");
        }
    }

    public static void test2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("已成年");
        } else {
            System.out.println("未成年");
        }
    }

    public static void test3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        if (age > 40){
            System.out.println("老登");
        } else if (age > 18){
            System.out.println("中登");
        } else if (age > 6) {
            System.out.println("小登");

        }

    }
}
