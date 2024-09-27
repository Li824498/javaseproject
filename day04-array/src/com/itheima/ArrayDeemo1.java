package com.itheima;

/**
 *      数组学习
 */
public class ArrayDeemo1 {
    public static void main(String[] args) {
        random();
    }

    //我是一名java初学者，请帮我一个随机点名的方法，十五名学生
    public static void random(){
//        String[] names = {"张三","李四","胡十五"};
//        String[] names = new String[]{"张三","李四","胡十五"};
        String names[] = new String[]{"张三","李四","胡十五"};
        //索引                             0       1       2       3       4       5       6       7       8       9       10      11      12
        System.out.println(names);
        int index = (int)(Math.random() * names.length);
        System.out.println(names[index]);
    }
}
