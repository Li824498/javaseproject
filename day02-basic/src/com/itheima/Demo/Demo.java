package com.itheima.Demo;

/**
 *  计算用户的bmi和bmr
 */

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        double height;
        int age;
        String sex;

        System.out.println("请输入您的体重：");
        weight = sc.nextDouble();

        System.out.println("请输入您的身高：");
        height = sc.nextDouble();

        System.out.println("请输入您的年龄");
        age = sc.nextInt();

        System.out.println("请输入您的性别");
        sex = sc.next();

        System.out.println(calcBMI(weight, height));

        System.out.println(calcBMR(weight, height, age, sex));


    }

    public static double calcBMI(double weight, double height){
        return weight / (height * 0.01 * height * 0.01);
    }

    public static double calcBMR(double weight, double height, int age, String sex){
        double bmr = 0;
        if(sex == "男"){
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }
        return bmr;
    }
}
