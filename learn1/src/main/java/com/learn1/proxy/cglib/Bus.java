package com.learn1.proxy.cglib;

/**
 * <br>
 *
 * @ClassName Dog
 * @Author dwj
 * @Date 2022/1/6 20:35
 * @Version 1.0
 */
public class Bus implements Car {


	@Override
	public void run() {
		System.out.println("Bus run");
	}

	public void show() {
		System.out.println("i am Bus");
	}
}
