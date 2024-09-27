package com.itheima.relearn2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Animal {


//    {
//        System.out.println("我是一个动物");
//    }

    static {
        System.out.println("我是一个静态的动物");
    }
    final int sum = 100;
    public final static String W_NAME = "超级养猪场";

    private String name;

    public abstract void cry();

}
