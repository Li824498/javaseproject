package com.itheima.thisDeemo;

import java.util.Random;

public class relearn {
    public static void main(String[] args) {
        tetst();
    }

    private static void tetst() {
//        String[] name = {"张三", "李四", "王五", "赵六", "钱七"};
//        String[] name = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
//        String name[] = {"张三", "李四", "王五", "赵六", "钱七"};
        String name[] = new String[]{"张三", "李四", "王五", "赵六", "钱七"};

        System.out.println(name[1]);

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        String[] code = new String[5];

        rel s1 = new rel("aa",12);
        System.out.println(s1.getName());

    }
}
