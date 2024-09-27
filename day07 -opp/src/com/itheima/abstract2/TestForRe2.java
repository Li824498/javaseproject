package com.itheima.abstract2;

public class TestForRe2 extends TestForRe {
    int number;

    public TestForRe2() {

    }

    public TestForRe2(String name, int age, int score, int number) {
        super(name, age, score);
        this.number = number;
    }

    public TestForRe2(int age) {
        this("a", age, 12, 10086);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "name:" + this.getName() + "|age:" + this.getName() + "score" + this.getScore() + "number:" + number;
    }
}
