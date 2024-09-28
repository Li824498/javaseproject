package relearn1;

import org.w3c.dom.ls.LSOutput;

public interface KillAnimal {
    String KILL_CODE = "KILL";

    void showkill();

    public default void run(){
        System.out.println("动物逃跑");
        run2();
    }

    private void run2() {
        System.out.println("私密级动物逃跑");
    }

    static void run3() {
        System.out.println("每天都有的动物逃跑");
    }
}
