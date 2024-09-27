package com.itheima.innerclass3;

public class Test2 {
    public static void main(String[] args) {
        //  目标：搞清楚匿名内部类的使用形式
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生会游泳");    //对象回调
            }
        };
        start(s1);

        System.out.println("=======================");

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生会游泳");
            }
        });
    }

    public static void start(Swim s){
        System.out.println("开始。。。");
        s.swimming();
        System.out.println("结束。。。");
    }
}

//class Teacher implements Swim{
//    public void swimming(){
//        System.out.println("老师会游泳");
//    }
//
//}
//
//class Student implements Swim{
//    public void swimming(){
//        System.out.println("学生会游泳");
//    }
//}

interface Swim{
    void swimming();
}
