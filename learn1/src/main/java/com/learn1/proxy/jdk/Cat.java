package com.learn1.proxy.jdk;

/**
 * <br>
 *
 * @ClassName Cat
 * @Author dwj
 * @Date 2022/1/6 20:32
 * @Version 1.0
 */
public class Cat implements Animal{
	@Override
	public void eat() {
		System.out.println("Cat eat");
	}

	@Override
	public int show() {
		System.out.println("Cat show");
		return 0;
	}
}
