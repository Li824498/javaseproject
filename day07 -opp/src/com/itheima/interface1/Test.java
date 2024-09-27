package com.itheima.interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME);
        //注意：接口不能创建对象
        //接口可以被实现类实现，差不多是干爹
        C c = new C();
        c.play();


    }
}
//所有接口的抽象方法必须全部重写
class C implements B, A{

    @Override
    public void run() {

    }

    @Override
    public void play() {
        System.out.println("p");

    }
}
