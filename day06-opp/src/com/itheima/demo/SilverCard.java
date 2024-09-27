package com.itheima.demo;

public class SilverCard extends Card{
    public SilverCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void consume(double money){
        if(getMoney() < money * 0.9){
            System.out.println("余额不足");
            return;
        }

        System.out.println("消费:" + money);
        System.out.println("优惠后:" + money * 0.9);
        setMoney(getMoney() - money * 0.9);


    }

}
