package com.learn1.selfBFPP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 *
 * @ClassName BfppTest
 * @Author dwj
 * @Date 2021/11/23 11:01
 * @Version 1.0
 */
public class BfppTest {
	@Test
	public void BDFPPOrderedTest(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springContext.xml");
		System.out.println("OK");
	}

	@Test
	public void BFPPAddTest(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("OK");
	}
}
