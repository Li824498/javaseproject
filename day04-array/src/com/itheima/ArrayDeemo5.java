package com.itheima;

import java.util.Random;

public class ArrayDeemo5 {
    public static void main(String[] args) {
        arrayPrint();

    }

    public static void arrayPrint(){
        int[][] arr = new int[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                arr[i][i1] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1] + " ");

            }
            System.out.println(" ");

        }

    }



}
