package com.itheima.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        //  目标：特定类型的方法引用
        String[] names = {"Tom", "Jerry", "Bobi", "Mike", "angels", "caocao"};

//        Arrays.sort(names);

//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.toString(names));
//        Arrays.sort(names, new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2)  {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));



    }
}
