package com.itheima.demo;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：洗车小程序
        //1.创建卡片类
        //2.金卡：继承，0.8优惠，特殊功能：洗车票
        //3.银卡：继承，0.9优惠
        //4.支付及类
        //5.金卡对象
        //6.银卡对象

        GoldCard goldCard = new GoldCard("鄂A860MM", "dlei", "18665616520", 5000);
        SilverCard silverCard = new SilverCard("粤A88888", "dlei", "18984724244", 2000);

        //
        pay(goldCard);
        pay(silverCard);

    }

    public static void pay(Card c){
        System.out.println("刷卡，输入金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);

    }
}

