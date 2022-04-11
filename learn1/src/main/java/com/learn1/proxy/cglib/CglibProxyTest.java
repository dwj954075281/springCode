package com.learn1.proxy.cglib;

import java.lang.reflect.Method;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglib动态代理
 * 1.无需面向接口编程（解决了jdk动态代理的一个缺点）；
 * 2.生成的代理类是以子类的方式来进行实现；
 * 3.使用fastClass方式生成的字节码
 *
 * @ClassName CglibProxyTest
 * @Author dwj
 * @Date 2022/1/6 20:47
 * @Version 1.0
 */
public class CglibProxyTest {
	public static void main(String[] args) {
		MyCglibProxy myCglibProxy=new MyCglibProxy();
		Bus proxy = (Bus)myCglibProxy.getProxy(new Bus());
		proxy.run();
		proxy.show();

	}

	@Test
	public void test1(){
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(new Bus().getClass());
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("匿名内部类方法，cglib代理");
				Object o1 = methodProxy.invokeSuper(o, objects);
				return o1;
			}
		});
		Bus proxy = (Bus)enhancer.create();
		proxy.run();
		proxy.show();

	}
}
