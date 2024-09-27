package com.itheima.innerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚成员内部类的语法
        //  成员内部类创建对象的格式
        //
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
        //  成员内部类访问外部类成员的特点（拓展）
        //  1.  成员内部类可直接访问外部类的静态成员，也可外部类的实例成员
        //  实际上是省略了"类名."
        //  2.  寄生外部类对象的成员，可以"类名.this."拿到，不能省略
        //  heartBeat   方法的
        //  this.heartBeat  内部类的
        //  People.this.heartBeat   外部类的
    }
}
