package com.itheima.thisDeemo;

public class Sudent {

    String name;
    public void print(){
        System.out.println(this);
        System.out.println(this.name);
    }

    public void printHobby(String name){
        System.out.println(this.name + "xihuan:" + name);
    }

    public Sudent(String name){
        this.name = name;

    }

    public Sudent(){


    }
}
