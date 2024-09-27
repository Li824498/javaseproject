package com.itheima.relarn1;

public class Test {
    public static void main(String[] args) {
        People s = new Student("张三",100,18);
        Teacher t = new Teacher("张老师",100);
        s.say();
        t.say();
        if (s instanceof Student) {
            System.out.println("s");
        }
        System.out.println(t.toString());
        System.out.println(People.TEST);;
        ControlPanel2.getInstance().print();

        System.out.println(A.X);

        A a2 = A.Y;
        System.out.println(a2.name());
        System.out.println(a2.ordinal());

        People.go(Directions.UP);

        D b = new D();
        new D();
//        b.print();
//        B.tp();

//        D.Inner b2 = new D().new Inner();
//        b2.print();

//        D b2 = new D;
//        D.Inner b3 = b2.new Inner();

        People pp = new People() {
            @Override
            public void say() {
                System.out.println("say");
            }
        };

        pp.say();


    }
}
