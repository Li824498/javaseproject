package com.itheima;

public class ArrayDeemo6 {
    public static void main(String[] args) {
        start(4);
    }

    public static void start(int n){
        int[][] arr = new int[n][n];

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                arr[i][i1] = count++;
            }
        }

        printArray(arr);


        System.out.println("--------------------------------------");

        //3.daluan

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                int m1 = (int) (Math.random() * arr.length);
                int m2 = (int) (Math.random() * arr[i].length);

                int temp = arr[m1][m2];
                arr[m1][m2] = arr[i][i1];
                arr[i][i1] = temp;

            }

        }

        printArray(arr);
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1] + " ");

            }
            System.out.println(" ");
        }
    }
}
