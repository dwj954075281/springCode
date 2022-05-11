package com.learn1.proxy.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName OrderService
 * @Author dwj
 * @Date 2022/1/10 16:54
 * @Version 1.0
 */

@Component
public class OrderService implements Order{
	@Autowired
	private UserService userService;
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
