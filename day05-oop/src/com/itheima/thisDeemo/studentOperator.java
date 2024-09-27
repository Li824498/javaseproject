package com.itheima.thisDeemo;

public class studentOperator {
    private student s;
    public studentOperator(student s){
        this.s = s;
    };

    public void Oprint(){
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }

}
