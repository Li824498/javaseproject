package com.itheima.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        whiletest1();
    }

    public static void whiletest1()
    {
        double i = 100000;
        double rate = 0.017;
        int year = 0;
        while(i<200000) {
            i += i * rate;
            year++;
            System.out.println(i);
        }
        System.out.println(year);
    }
}
