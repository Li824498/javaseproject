package com.itheima.staticmethod;

public class Student {

    private double score;
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Java EE");
    }

    public void printPass(){
        System.out.println(score >= 60 ? "dui" : "cuo");
    }

    public void setScore(double score) {
        this.score = score;
    }
}
