package com.itheima.code;

public class CodeDemo2 {
    private String name;
    private String[] directions;
    //实例代码块（构造代码块）：无static修饰，属于对象，每次创建对象都会优先执行一次。
    //基本作用:初始化对象的实例资源。
    {
        System.out.println("zhixing");
        name = "tt";
        directions = new String[]{"东","南","西","北"};
    }
    public static void main(String[] args) {
        new CodeDemo2();
        new CodeDemo2();

    }
}
