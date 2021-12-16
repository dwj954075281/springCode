package com.learn1.selfTag.selFactoryBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName Apple
 * @Author dwj
 * @Date 2021/12/7 11:42
 * @Version 1.0
 */
@Component
public class Apple  {

	@Autowired
	private Banner banner;


	public void show() {
		System.out.println(this);
	}
}
