package com.itheima.loop;

import java.util.Scanner;

public class CalcDeemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x:");
        int x = sc.nextInt();
        System.out.println("y:");
        int y = sc.nextInt();
        System.out.println("operator");
        String operator = sc.next();
        calc(x, y, operator);
    }

    public static void calc(int x, int y, String operator){
        switch (operator) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("输入的运算符有误");
        }
    }
}
