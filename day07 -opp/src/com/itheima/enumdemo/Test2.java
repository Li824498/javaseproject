package com.itheima.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        //1.常量
        move(Direction.DOWN);
    }

//    public static void move(int direction){
//        switch (direction){
//            case Constant.UP:
//                System.out.println("向上移动");
//                break;
//            case Constant.DOWN:
//                System.out.println("向下移动");
//                break;
//            case Constant.LEFT:
//                System.out.println("向左移动");
//                break;
//            case Constant.RIGHT:
//                System.out.println("向右移动");
//                break;
//            default:
//                System.out.println("输入有误");
//        }
//
//    }


    public static void move(Direction direction){
        switch (direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }

    }
}
