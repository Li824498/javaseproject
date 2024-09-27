package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        //一步步实现小案例
        //1.创建学生对象，封装数据
        //2.准备学生数据，先自造
        Student[] allstudents = new Student[10];
        allstudents[0] = new Student("张三",  '男', 100);
        allstudents[1] = new Student("李四",  '女', 90);
        allstudents[2] = new Student("王五",  '男', 80);
        allstudents[3] = new Student("赵六",  '女', 70);
        allstudents[4] = new Student("钱七",  '男', 60);
        allstudents[5] = new Student("孙八",  '女', 50);
        allstudents[6] = new Student("周九",  '男', 40);
        allstudents[7] = new Student("吴十",  '女', 30);
        allstudents[8] = new Student("郑十一", '男', 20);
        allstudents[9] = new Student("王十二", '女', 10);

        //3.提供两套方案，支持灵活切换（解耦合），面向接口编程
        //  -- 接口
        //  -- 实现类
        //  -- 实现类
        ClassDataInter cdi = new ClassDataInterImpl2(allstudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
