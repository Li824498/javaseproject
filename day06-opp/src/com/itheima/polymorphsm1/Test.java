package com.itheima.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Tortoise();//对象多态
        a1.run();//多态：方法，编译看左运行看右
//        System.out.println(a1.name);//变量只看左，无多态说法
        Animal b1 = new Wolf();
        go(b1);
//        b1.cry(); //多态下不能调独有功能

        Wolf t1 = (Wolf) b1;
        t1.cry();

        if(a1 instanceof Wolf){  //java建议提前判断类
            Wolf w1 = (Wolf) a1;
            w1.cry();
        } else {
            System.out.println("不是");
        }


        Wolf b2 = new Wolf();
        go(b2);
        b2.cry();

    }

    public static void go(Animal a){
        System.out.println("kaishi");
        a.run();
    }
}
