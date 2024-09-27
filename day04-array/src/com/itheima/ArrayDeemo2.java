package com.itheima;

import java.util.Scanner;

public class ArrayDeemo2 {
    public static void main(String[] args) {
        inputScore();
    }

    public static void inputScore(){
        double[] scores = new double[8];

        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println("请输入第" + (i + 1) + "个学生的成绩:");
            scores[i] = sc.nextDouble();
        }

        double allScore = 0.0;
        for (int i = 0; i < scores.length; i++){
            allScore += scores[i];

        }
        System.out.println("平均成绩：" + allScore / scores.length);

        double max = scores[0];
        for (int i =0; i < scores.length;i ++){
            double data = scores[i];
            if (max <= scores[i]){
                max = scores[i];
            }
        }
        System.out.println("max:" + max);


    }
}
