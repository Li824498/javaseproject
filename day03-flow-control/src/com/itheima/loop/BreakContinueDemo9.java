package com.itheima.loop;

public class BreakContinueDemo9 {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        for (int i = 0; i < 10; i++ ){
            if (i == 3){
                continue;
            }
            if (i == 6){
                break;
            }
            System.out.println(i);
        }

    }
}
