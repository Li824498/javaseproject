package com.itheima.relearn2;

public class PanelAnimal {

    static PanelAnimal pa = new PanelAnimal();

    private PanelAnimal(){}

    public static PanelAnimal getInstance(){
        return pa;
    }

    public void test(){
        System.out.println("测试成功");
    }
}
