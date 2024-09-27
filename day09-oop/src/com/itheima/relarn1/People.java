package com.itheima.relarn1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class People {
    public static final String TEST = "原神";

    private String name;
    private int age;

    public abstract void say();

    public static void go(Directions direction){
        switch (direction){
            case UP:
                System.out.println("向上");
                break;
            case DOWN:
                System.out.println("向下");
                break;
            case LEFT:
                System.out.println("向左");
                break;
            case RIGHT:
                System.out.println("向右");
                break;
            default:
                System.out.println("错误");
        }
    }
}
