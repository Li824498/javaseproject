package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD implements Switch {
    private String name;
    private boolean status; //默认false

    @Override
    public void press() {//有点看不明白
        status = !status;
    }
}
