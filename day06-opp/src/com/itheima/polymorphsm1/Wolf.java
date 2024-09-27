package com.itheima.polymorphsm1;

public class Wolf extends Animal{
    @Override
    public void run(){
        System.out.println("狼跑得快");
    }

    public void cry(){
        System.out.println("wolf");
    }

}
