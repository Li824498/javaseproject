package com.itheima.loop;

public class ForDeemo2 {
    public static void main(String[] args) {
//        System.out.println("1-10的奇数和:" + sum(10));
        waternumber();
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i+=2){
            sum += i;
        }
        return sum;
//        System.out.println(sum);
    }

    public static void waternumber(){
        int n3 = 0;
        int n2 = 0;
        int n1 = 0;
        for (int i = 100; i <= 999; i++){
            n3 = i / 100;
            n2 = (i - n3 * 100) / 10;
            n1 = (i - n3 * 100 - n2 * 10);
            if (n3 * n3 * n3 + n2 * n2 * n2 + n1 * n1 * n1 == i){
                System.out.println(i);
            }
        }
    }
}
