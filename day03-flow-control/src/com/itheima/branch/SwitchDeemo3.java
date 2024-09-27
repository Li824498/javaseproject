package com.itheima.branch;

public class SwitchDeemo3 {
    public static void main(String[] args) {
        switchTest(19);
    }

    public static  void switchTest(int age){
        int b = 20;
        switch (age){
            case 18:
                System.out.println("你18了");
                break;
            case 19:
                System.out.println("你19了");
                break;
            case 20:
                System.out.println("你20了");
                break;

            default:
                System.out.println("你不是1819");

        }
    }
}
