package com.itheima.relarn1;

public class ControlPanel2 {
    private static ControlPanel2 cp2;

    private ControlPanel2(){}


    public static ControlPanel2 getInstance(){
        if (cp2 == null) {
            cp2 = new ControlPanel2();
        }
        return cp2;
    }

    public void print(){
        System.out.println("已调用");
    }

}
