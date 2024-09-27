package com.itheima.loop;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class NumberDeemo1 {
    public static void main(String[] args) {
        guess();

    }

    public static void guess(){
//        int num = (int)(Math.random() * 100) + 1;   //[0,1)小数 ==> [0,100) ==>

        Random r = new Random();//
        int luckNumber = r.nextInt(100) + 1;   //[0,99]

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("num:");
            int num = sc.nextInt();

            if (num > luckNumber){
                System.out.println("big了");
            } else if (num < luckNumber) {
                System.out.println("small了");

            } else {
                System.out.println("yes");
                break;
            }
        }




    }
}
