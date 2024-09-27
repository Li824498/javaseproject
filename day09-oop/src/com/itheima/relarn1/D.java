package com.itheima.relarn1;

public class D implements B, C{
     {
        System.out.println("yuanshen");
    }
    @Override
    public void BBtest(){
        System.out.println("afhka");

    }

    @Override
    public void CCtest(){
        System.out.println("ccccc");
    }

    public class Inner {
         public void print(){
             System.out.println("inner");
         }
    }
}
