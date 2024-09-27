package com.itheima.staticmethod;

import java.util.Random;

public class VerifayCodeUtil {

    private VerifayCodeUtil(){

    }

    public static String num(int n){
        Random r = new Random();

        String code = "";
        for (int i = 1; i <= n; i++){
            int c;
            int var = r.nextInt(3);
            switch (var){
                case 0:
                    c = r.nextInt(10);
                    code += c;
                    break;
                case 1:
                    c = (int) 'a' + r.nextInt((int)'z' - (int)'a');
                    code += (char) c;
                    break;
                case 2:
                    c = (int) 'A' + r.nextInt((int)'Z' - (int)'A');
                    code += (char) c;
                    break;
                default:
                    System.out.println("wrong");
            }


        }


        return code;

    }
}
