package com.itheima.branch;

/**
 *  if语句小练习
 */
public class iftest2 {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if (red){
            System.out.println("红灯停");
        } else if (yellow) {
            System.out.println("黄灯也停");
        } else if (green) {
            System.out.println("绿灯行");
        }
    }
}
