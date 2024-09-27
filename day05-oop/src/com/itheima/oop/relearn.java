package com.itheima.oop;

import java.util.Random;
import java.util.Scanner;
public class relearn {


    public static void main(String[] args) {
        relearn(1);
        relearn(2);
        relearnClass a = new relearnClass();
        a.name = "aas";
        a.age = 12;
        a.number = 123456;

        a.printInfo();
    }

    public static void relearn(int a){
        String[] arr = {"a", "b", "c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("-------------------------------");

        String[] arr2 = new String[8];
        arr2[0] = "abc";
        arr2[1] += "sss";
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }


    }
}
