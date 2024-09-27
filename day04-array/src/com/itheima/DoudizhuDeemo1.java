package com.itheima;

public class DoudizhuDeemo1 {
    public static void main(String[] args) {
        cardmake();

    }

    public static void cardmake(){
        String[] poker = new String[54];
        String[] colours = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < colours.length; i1++) {
                poker[index++] = colours[i1] + numbers[i];
            }

        }

        poker[index++] = "小王";
        poker[index++] = "大王";

        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");

        }

        System.out.println(" ");

        for (int i = 0; i < 100; i++) {
            int index1 = (int)(Math.random() * poker.length);
            int index2 = (int)(Math.random() * poker.length);


            String temp = poker[index1];
            poker[index1] = poker[index2];
            poker[index2] = temp;


        }

        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
    }


}
