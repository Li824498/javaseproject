package com.itheima.extendsfeature;

public class Test2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();

    }
}

class Fu{
    String name = "fu的name";

    public void run(){
        System.out.println("fu的run方法");
    }
}

class Zi extends Fu{
    String name = "zi的name";

    public void run(){
        System.out.println("zi的run方法");
    }

    public void show() {
        String name = "show的name";

        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        run();
        super.run();

    }
}
