package com.learn1.proxy.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName UserService
 * @Author dwj
 * @Date 2022/4/21 16:51
 * @Version 1.0
 */
@Component
public class UserService implements UserInterface {

	@Autowired
	private OrderService OrderService;

	@Override
	public void getUserInfo() {

	}
}
