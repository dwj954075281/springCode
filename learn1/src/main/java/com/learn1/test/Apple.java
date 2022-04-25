package com.learn1.test;

/**
 * <br>
 *
 * @ClassName Apple
 * @Author dwj
 * @Date 2022/4/21 19:49
 * @Version 1.0
 */
public class Apple extends Fruit {
	@Override
	protected Fruit getFruit(String fruitName) {
		return null;
	}

	public Apple() {
		System.out.println("我得到了一个苹果" );
	}
}
