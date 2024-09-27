package com.itheima.loop;

public class sushuDeemo1 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 101; i <= 200; i++){
            if(isPrime(i)){
                System.out.println(i);
                n++;
            }
        }
        System.out.println(n);
    }


    public static boolean isPrime(int number){
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
