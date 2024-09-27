package com.itheima.interface3;

public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }

    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("品均分:" + sum / students.length);

    }
}
