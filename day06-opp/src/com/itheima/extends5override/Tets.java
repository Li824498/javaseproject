package com.itheima.extends5override;

public class Tets {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();

    }
}

class Cat extends Animal{
    @Override
    public void cry(){
        System.out.println("Cat cry");
    }

}

class Animal{

    public void cry(){
        System.out.println("Animal cry");
    }
}
