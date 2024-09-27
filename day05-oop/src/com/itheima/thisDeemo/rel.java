package com.itheima.thisDeemo;

public class rel {
    private String name;
    private int age;

//    public rel(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public rel(String name, int age){
        this.name = name;
        this.age= age;
    }

    public rel(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
