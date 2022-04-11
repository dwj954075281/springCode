package com.learn1.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <br>
 *
 * @ClassName AnimalProxy
 * @Author dwj
 * @Date 2022/1/5 21:15
 * @Version 1.0
 */
public class AnimalProxy {

	public static Animal getProxy(Animal target){
		ClassLoader cl=target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		InvocationHandler h=new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK动态代理2222，监听开始！");
				Object result = method.invoke(target, args);
				System.out.println("JDK动态代理2222，监听结束！");
				return result;
			}
		};
		Animal p= (Animal) Proxy.newProxyInstance(cl,interfaces,h);
		return p;
	}
}
