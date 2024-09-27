package com.itheima.relearn2;

public class PanelAnimal2 {

    static PanelAnimal2 pa2;


    private PanelAnimal2(){

    }

    static public PanelAnimal2 getInstance(){
        if (pa2 == null){
            pa2 = new PanelAnimal2();
        }
//        pa2 = new PanelAnimal2();
        return pa2;
    }

    public void test(){
        System.out.println("测试成功");
    }
}
