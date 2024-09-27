package com.itheima.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {

//        CarFactory df = name -> new Car(name);
        CarFactory df = Car::new;


        Car c1 = df.getCar("奔驰");
        System.out.println(c1);
    }
}

@FunctionalInterface
interface CarFactory{
    Car getCar(String name);
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Car{
    private String name;
}
