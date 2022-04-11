package com.learn1.proxy.cglib;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * <br>
 *
 * @ClassName MyCglib
 * @Author dwj
 * @Date 2022/1/6 20:38
 * @Version 1.0
 */
public class MyCglibProxy implements MethodInterceptor {

	private Object targetObject;

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("Cglib的动态代理");
		Object invoke = methodProxy.invokeSuper(o, objects);
		return invoke;
	}

	public Object getProxy(Object target){
		this.targetObject=target;
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
}
