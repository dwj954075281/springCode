package com.learn1.proxy.aop;

/**
 * <br>
 *
 * @ClassName Logutils
 * @Author dwj
 * @Date 2022/1/10 16:56
 * @Version 1.0
 */
public class Logutils {
	public void before(){
		System.out.println("Spring Aop 切入before");
	}

	public void after(){
		System.out.println("Spring Aop 切入after");

	}

	public void afterReturning(){
		System.out.println("Spring Aop 切入 afterReturning");

	}

	public void afterThrowing(){
		System.out.println("Spring Aop 切入 afterThrowing");

	}

	public void around(){
		System.out.println("Spring Aop 切入 around");

	}
}
