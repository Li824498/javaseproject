package com.itheima.relearn2;

public class test {
    public static void main(String[] args) {
        Dog d = new Dog("小明");
        d.cry();
        System.out.println(d);

        if (d instanceof Dog) {
            System.out.println("yes");
        }

        System.out.println(d.sum);
        System.out.println(d.W_NAME);
        System.out.println(Animal.W_NAME);


        System.out.println("=================");


        PanelAnimal.getInstance().test();
        PanelAnimal2.getInstance().test();

        System.out.println("========================");

        System.out.println(SignTest.X);

        SignTest st = SignTest.Y;
        System.out.println(st);
        System.out.println(st.name());
        System.out.println(st.ordinal());


        move(st);

        d.eat();
        d.eat_zdgm();
        DoDo.eat_sta();

        System.out.println("=====================");
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        System.out.println("=======================");
//        Dog.DogBaby db = new Dog().new DogBaby();
//        new Dog.DODODO();

        System.out.println("====================");
//        Animal2 a2 = () -> System.out.println("汪2");
//        a2.cry();
        cry2 c2 = () -> System.out.println("crycry");
//        c2.cry();


        System.out.println("==========================");
        String e1 = "123";
        String e2 = "123";
        System.out.println(e1 == e2);
        String e3 = new String("123");
        String e4 = new String("123");
        System.out.println(e3 == e4);
        System.out.println(e3.equals(e4));
        String num = "12345678900";
        System.out.println(num.substring(0, 3));


    }

    private static void move(SignTest st) {
        switch (st){
            case SignTest.X:
                System.out.println("X");
                break;
            case Y:
                System.out.println("Y");
                break;
            case Z:
                System.out.println("Z");
                break;
            default:
                System.out.println("default");

        }
    }
}

interface cry2{
    void cry();
}
