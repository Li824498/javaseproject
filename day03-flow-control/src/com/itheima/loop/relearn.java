package com.itheima.loop;

import java.util.Random;

public class relearn {
    public static void main(String[] args) {
        relearn(191);
    }

    public static void relearn(int a){

        Random r = new Random();
        int luckNumber = (int) (Math.random() * 100) + 1;
        System.out.println(luckNumber);
        int i = 0;
        do {
            System.out.print("sout");
            i ++;
        } while (i < 10);


    }
}
