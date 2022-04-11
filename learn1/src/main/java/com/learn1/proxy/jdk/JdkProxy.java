package com.learn1.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @ClassName JdkProxy
 * @Author dwj
 * @Date 2022/1/5 21:03
 * @Version 1.0
 */
public class JdkProxy implements InvocationHandler {
	private Object target;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("JDK动态代理，监听开始！");
		Object result = method.invoke(target, args);
		System.out.println("JDK动态代理，监听结束！");
		return result;
	}

	public Object getProxy(Object targetObject){
		this.target=targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
	}
}
