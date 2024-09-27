package com.itheima.abstract3;

public abstract class People {

    public final void write(){
        System.out.println("A");
//        System.out.println("B");
        writeMain();
        System.out.println("C");

    }


    public abstract void writeMain();
}
