package com.itheima.scanner;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("年龄是" + age);

        System.out.println("请输入您的姓名：");
        String name = sc.next();
        System.out.println("欢迎：" + name);
    }
}
