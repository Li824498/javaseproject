package com.itheima.abstract2;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
public class relearn {
    public static void main(String[] args) {
        TestForRe t = new TestForRe("aa", 12, 100);
        System.out.println(t.getName());


        System.out.println("------------------");

        TestForRe2 t2 = new TestForRe2("a", 150, 200, 10086);
        System.out.println(t2.getName());
        System.out.println(t2);

        System.out.println("______________");
        TestForRe2 t3 = new TestForRe2(12);
        System.out.println(t3);


    }

    private static void test(int i, int i1, int i2) {
        i = (int) (Math.random() * 10);
        Random r = new Random();
        System.out.println(i);
        System.out.println(r.nextInt(100));




    }


}
