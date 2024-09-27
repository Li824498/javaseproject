package com.itheima.stringdemo;

public class StringTest2 {
    public static void main(String[] args) {
        System.out.println(getCode(6));

    }
    public static String getCode(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "";
        for (int i = 1; i <= n; i++) {
            int index = (int) (Math.random() * str.length());
            code += str.charAt(index);
        }

        return code;

    }
    //


}
