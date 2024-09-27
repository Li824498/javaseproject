package com.itheima.innerclass3;

public class Test {
    public static void main(String[] args) {
        //  目标：认识匿名内部类
        //  实际上有名字：外部类名$编号.class
        //  本质是子类，同时会立即创建匿名对象
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}

//class Cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}