package com.itheima.demo;

public class GoldCard extends Card{
    public GoldCard(String carId, String name, String phone, double money){
        super(carId, name, phone, money);

    }
    @Override
    public void consume(double money){
        if(getMoney() < money * 0.8){
            System.out.println("余额不足");
            return;
        }
        System.out.println("消费:" + money);
        System.out.println("优惠后:" + money * 0.8);
        setMoney(getMoney() - money * 0.8);



        if(money * 0.8 >= 200){
            printTicket();
        }else {
            System.out.println("不行");
        }
    }

    public void printTicket() {
        System.out.println("洗车票");
    }
}
