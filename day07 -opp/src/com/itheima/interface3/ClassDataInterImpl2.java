package com.itheima.interface3;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        int maleCount = 0;
        System.out.println("全班学生信息：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
            if (s.getSex() == '男') {
                maleCount++;
            }
        }
        System.out.println("男学生人数：" + maleCount);
        System.out.println("女学生人数：" + (students.length - maleCount));

    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        double max = students[0].getScore();
        double min = students[0].getScore();

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();

            if(s.getScore() > max){
                max = s.getScore();
            }

            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("品均分:" + (sum - max -min)/ students.length);
        System.out.println("max:" + max);
        System.out.println("min:" + min);


    }
}
