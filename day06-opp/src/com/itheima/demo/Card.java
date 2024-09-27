package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String caiId;
    private String name;
    private String phone;
    private double money;

    //存储金额
    public void deposit(double money){
        this.money += money;
    }
    //消费金额
    public void consume(double money){
        this.money -= money;
    }

}
