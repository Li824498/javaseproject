package com.itheima.relarn1;

public class ControlPanel {
    private static ControlPanel cp = new ControlPanel();

    private ControlPanel(){}

    public static ControlPanel getInstance(){
        return cp;
    }

    public void print(){
        System.out.println("已调用");
    }
}
