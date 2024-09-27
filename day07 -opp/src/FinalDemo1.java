public class FinalDemo1 {
    public static final String schoolName = "黑马程序员";//常亮了，不可修改，final修饰静态变量,必须的同时赋值
    public static void main(String[] args) {
        /*
            a.成员变量:
                静态成员变量
                实例成员变量
            b.局部变量:
         */
        final double rate = 3.14;

        buy(0.8);

        //final修饰的引用，之内的可以修改


    }

    public static void buy(final double z){
//        z += 1;
        System.out.println(z);
    }
}

class A{

    public final void show(){
        System.out.println("执行");
    }
}
class B extends A{}
