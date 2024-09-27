package com.itheima.relarn1;

public interface B {
    String BB = "BB";

    void BBtest();

    public default void print()
    {
        System.out.println("B");
        eun();
    }

    static void tp(){
        System.out.println("tptp");
    }

    private void eun(){
        System.out.println("eun");
    }
}
