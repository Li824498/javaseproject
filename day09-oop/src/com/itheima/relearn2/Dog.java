package com.itheima.relearn2;

public class Dog extends Animal implements DoDo2{

    private static int number = 100;

    public Dog() {
    }

    public Dog(String name) {
        super(name);
//        this.setName(name);
    }

    @Override
    public void cry(){
        System.out.println("汪");
    }

    @Override
    public String toString(){
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("吃骨头");
    }

//    public class DogBaby(){
//        public void cry(){
//            System.out.println("汪汪汪");
//        }
//    }
//
//    public static class DODODO(){
//        public void gn() {
//            System.out.println(number);
//        }
//
//    }
}
