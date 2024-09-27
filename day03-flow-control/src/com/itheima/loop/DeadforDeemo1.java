package com.itheima.loop;

public class DeadforDeemo1 {
    public static void main(String[] args) {
        deadloop();
    }

    public static void deadloop(){
//        for(;;){
//            System.out.println("loup");
//        }

//        while(true){
//            System.out.println("loup");
//        }

        do {
            System.out.println("loop");
        } while (true);
    }
}
