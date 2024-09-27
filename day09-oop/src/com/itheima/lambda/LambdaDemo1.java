package com.itheima.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Swim s1 = () -> {
            System.out.println("swim");
        };
        s1.swimming();

    }
    //lambda只能处理函数式接口
    //只有一个抽象方法
}


abstract class Animal{
    public abstract void cry();
}
@FunctionalInterface
interface Swim{
    void swimming();
}