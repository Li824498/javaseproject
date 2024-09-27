package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //system
        //角色：吊灯、电视机、洗衣机、落地窗
        //功能：开和关
        //谁控制：智能控制系统（单例对象），控制调用设备的开和关，开关是被调用的功能，在角色里
        //1.定义设备类
        //2.准备这些对象，放到数组中

        JD[] jds = new JD[4];
        jds[0] = new TV("电视", true);
        jds[1] = new WashMachine("洗衣机", false);
        jds[2] = new Lamp("吊灯", true);
        jds[3] = new Air("空调", false);

        //3.开关功能，每个设备,定义接口
        //4.创建智能控制系统
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //5.控制电视
//        smartHomeControl.control(jds[0]);


        //6.提示用户操作，a。展示全部的设备当前的情况b。让用户选择
        while (true) {//crtl + alt + T
            smartHomeControl.printAllStatus(jds);
            System.out.println("请选择您要控制的设备");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出App");
                    return;
                default:
                    System.out.println("输入有误");
            }
        }


    }
}
