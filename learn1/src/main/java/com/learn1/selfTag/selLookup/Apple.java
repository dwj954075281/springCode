package com.learn1.selfTag.selLookup;

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
public class Apple implements Fruit{

	@Override
	public void show() {
		System.out.println(this);
	}
}
