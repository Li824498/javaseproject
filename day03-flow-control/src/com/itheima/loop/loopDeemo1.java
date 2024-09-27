package com.itheima.loop;

public class loopDeemo1 {
    public static void main(String[] args) {
        calc();
    }

    public static void calc(){
        double paperHeight = 0.1;
        double peakHeight = 8848860;
        int count = 0;
//        double sumHeight = 0;

        while (paperHeight < peakHeight){
            paperHeight *= 2;
            count ++;
        }
        System.out.println(count);
    }
}
