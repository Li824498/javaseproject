package com.itheima.relearn2;

public interface DoDo2 {
    void eat();

    private void eat_toutou(){
        System.out.println("吃肉2");
    }

    default void eat_zdgm(){
        eat_toutou();
    }

    static void eat_sta(){
        System.out.println("吃鱼2");
    }
}
