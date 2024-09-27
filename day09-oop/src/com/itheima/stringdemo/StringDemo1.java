package com.itheima.stringdemo;
import java.util.Scanner;
public class StringDemo1 {
    public static void main(String[] args) {
        // 1.way1：""创建字符串
        String s1 = "hello，黑马";
        System.out.println(s1);
        System.out.println(s1.length());

        //  2.way2：通过构造器初始化
        String s2 = new String();//不推荐
        System.out.println(s2);
        String s3 = new String("hello，黑马");//不推荐
        System.out.println(s3);

        char[] chars = {'h','e','l','l','o','，','黑','马'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);
        System.out.println(s5);


        System.out.println("==============================");
        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);//""方式，相同内容只有一份
        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);//new方式，相同内容多份

        System.out.println("==============================");
        String okloginName = "admin";
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();

        // == 判断的是地址！！！
        // eauals好用
        if(okloginName.equals(loginName)){
            System.out.println("恭喜您，登录成功！");
        }else{
            System.out.println("登录失败！");
        }

        System.out.println("==============================");


        System.out.println("请您使用手机号登录：");
        String number = sc.next();
        System.out.println("登录为" + number.substring(0, 3) + "****" + number.substring(7));
    }
}
