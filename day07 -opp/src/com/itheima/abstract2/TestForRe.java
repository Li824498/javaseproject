package com.itheima.abstract2;

public class TestForRe {
    static int count = 0;

    private String name;
    private int age;
    private int score;

    public TestForRe() {
        count++;
    }

    public TestForRe(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println(++count);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
