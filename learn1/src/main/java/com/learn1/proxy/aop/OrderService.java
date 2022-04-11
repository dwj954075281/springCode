package com.learn1.proxy.aop;

/**
 * <br>
 *
 * @ClassName OrderService
 * @Author dwj
 * @Date 2022/1/10 16:54
 * @Version 1.0
 */

public class OrderService implements Order{
    @Override
    public void Order() {
        System.out.println("正在下单");
    }

    @Override
    public String pay(Integer OrderNo) {
        System.out.println("正在支付pay"+OrderNo);
        return null;
    }
}
