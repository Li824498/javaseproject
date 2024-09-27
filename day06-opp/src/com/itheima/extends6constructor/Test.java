package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Zi extends Fu {
    public Zi() {
        super(1);
        System.out.println("子类无参构造方法");
    }
}

class Fu {
    private Fu() {
        System.out.println("父类无参构造方法");
    }

    public Fu(int a) {
        System.out.println("父类有参构造方法");
    }
}
