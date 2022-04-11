package com.learn1.proxy.jdk;

/**
 * <br>
 *
 * @ClassName Dog
 * @Author dwj
 * @Date 2022/1/5 20:59
 * @Version 1.0
 */
public class Dog implements Animal{
	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public int show() {
		System.out.println("Dog show");
		return 2;
	}

	public int run() {
		System.out.println("run");
		return 0;
	}
}
